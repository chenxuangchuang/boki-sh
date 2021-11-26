package com.chenxc.cxcboki.eportal.bo.impl;

import com.chenxc.cxcboki.eportal.bo.EportalLoginBo;
import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;
import org.springframework.stereotype.Component;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:22
 */
@Component
public class EportalLoginBoImpl implements EportalLoginBo {

    @Override
    public EportalLoginResDTO eportalLogin(EportalLoginReqDTO eportalLoginReqDTO) {
        EportalLoginResDTO eportalLoginResDTO = new EportalLoginResDTO();
        eportalLoginResDTO.setIsSuccessful(true);
        return eportalLoginResDTO;
    }
}
