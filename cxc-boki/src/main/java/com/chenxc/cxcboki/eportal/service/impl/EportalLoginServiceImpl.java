package com.chenxc.cxcboki.eportal.service.impl;

import com.chenxc.cxcboki.eportal.bo.EportalLoginBo;
import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;
import com.chenxc.cxcboki.eportal.service.EportalLoginService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:20
 */
@Component
public class EportalLoginServiceImpl implements EportalLoginService {

    @Resource
    EportalLoginBo eportalLoginBo;

    @Override
    public EportalLoginResDTO eportalLogin(EportalLoginReqDTO eportalLoginReqDTO) {
        EportalLoginResDTO eportalLoginResDTO = eportalLoginBo.eportalLogin(eportalLoginReqDTO);
        return eportalLoginResDTO;
    }
}
