package com.chenxc.cxcboki.eportal.bo;

import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:21
 */
public interface EportalLoginBo {

    public EportalLoginResDTO eportalLogin(EportalLoginReqDTO eportalLoginReqDTO);
}
