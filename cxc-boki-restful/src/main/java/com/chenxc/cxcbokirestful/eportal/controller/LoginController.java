package com.chenxc.cxcbokirestful.eportal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;
import com.chenxc.cxcboki.eportal.service.EportalLoginService;
import com.chenxc.cxcboki.util.BeanUtil;
import com.chenxc.cxcbokirestful.common.base.dto.ResultModel;
import com.chenxc.cxcbokirestful.common.constant.BaseErrorEnum;
import com.chenxc.cxcbokirestful.eportal.vo.req.EportalLoginReqVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Reference
    EportalLoginService eportalLoginService;

    @ResponseBody
    @RequestMapping(value = "/getLogin", method = RequestMethod.GET)
    public ResultModel getLogin(EportalLoginReqVO eportalLoginReqVO){
        logger.info("入参"+JSONObject.toJSONString(eportalLoginReqVO));
        try {
            EportalLoginReqDTO eportalLoginReqDTO = new EportalLoginReqDTO();
//        eportalLoginReqDTO.setUserName(eportalLoginReqVO.getUserName());
//        eportalLoginReqDTO.setUserPass(eportalLoginReqVO.getUserPass());
            BeanUtil.copyBeanNoCover(eportalLoginReqVO, eportalLoginReqDTO);
            EportalLoginResDTO eportalLoginResDTO = eportalLoginService.eportalLogin(eportalLoginReqDTO);
            return ResultModel.ok(eportalLoginResDTO);
        }catch (Exception e){
            e.printStackTrace();
            return ResultModel.error(e.getMessage());
        }

    }
}
