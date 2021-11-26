package com.chenxc.cxcbokirestful.eportal.controller;

import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;
import com.chenxc.cxcboki.eportal.service.EportalLoginService;
import com.chenxc.cxcbokirestful.eportal.controller.base.util.ResultBody;
import com.chenxc.cxcbokirestful.eportal.vo.req.EportalLoginReqVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    EportalLoginService eportalLoginService;

    @GetMapping("/getLogin")
    public ResultBody getLogin(EportalLoginReqVO eportalLoginReqVO){
        EportalLoginReqDTO eportalLoginReqDTO = new EportalLoginReqDTO();
        EportalLoginResDTO eportalLoginResDTO = eportalLoginService.eportalLogin(eportalLoginReqDTO);
        ResultBody resultBody = new ResultBody();
        resultBody.setResult(eportalLoginResDTO);
        return resultBody;
    }
}
