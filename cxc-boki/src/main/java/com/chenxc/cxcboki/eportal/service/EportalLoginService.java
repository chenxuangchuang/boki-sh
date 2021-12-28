package com.chenxc.cxcboki.eportal.service;

import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;

import javax.jws.WebService;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:20
 */
public interface EportalLoginService {

    public EportalLoginResDTO eportalLogin(EportalLoginReqDTO eportalLoginReqDTO);
}
