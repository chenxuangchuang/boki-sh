package com.chenxc.cxcbokirestful.eportal.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;
import com.chenxc.cxcboki.eportal.service.EportalLoginService;
import com.chenxc.cxcbokirestful.eportal.controller.base.util.ResultBody;
import com.chenxc.cxcbokirestful.eportal.vo.req.EportalLoginReqVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Reference
    EportalLoginService eportalLoginService;

    @GetMapping("/getLogin")
    @ResponseBody
    public ResultBody getLogin(EportalLoginReqVO eportalLoginReqVO) {
        logger.info("入参"+JSONObject.toJSONString(eportalLoginReqVO));
        EportalLoginReqDTO eportalLoginReqDTO = new EportalLoginReqDTO();
        EportalLoginResDTO eportalLoginResDTO = eportalLoginService.eportalLogin(eportalLoginReqDTO);
        ResultBody resultBody = new ResultBody();
        resultBody.setResult(eportalLoginResDTO);
        return resultBody;
    }
}
