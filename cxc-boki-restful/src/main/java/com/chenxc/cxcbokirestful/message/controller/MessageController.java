package com.chenxc.cxcbokirestful.message.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chenxc.cxcboki.message.dto.req.SendMessageReqDTO;
import com.chenxc.cxcboki.message.dto.res.SendMessageResDTO;
import com.chenxc.cxcboki.message.service.MessageService;
import com.chenxc.cxcboki.util.BeanUtil;
import com.chenxc.cxcbokirestful.common.base.dto.ResultModel;
import com.chenxc.cxcbokirestful.message.vo.req.SendMessageReqVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/12/31 14:10
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
    @Reference
    MessageService messageService;

    @ResponseBody
    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET)
    public ResultModel sendMessage(SendMessageReqVO sendMessageReqVO){
        try{
            SendMessageReqDTO sendMessageReqDTO = new SendMessageReqDTO();
            BeanUtil.copyBeanNoCover(sendMessageReqVO, sendMessageReqDTO);
            SendMessageResDTO sendMessageResDTO = messageService.sendMessage(sendMessageReqDTO);
            return ResultModel.ok(sendMessageResDTO);
        }catch (Exception e){
            e.printStackTrace();
            return ResultModel.error(e.getMessage());
        }
    }

}
