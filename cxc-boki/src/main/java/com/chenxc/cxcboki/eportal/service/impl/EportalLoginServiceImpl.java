package com.chenxc.cxcboki.eportal.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.chenxc.cxcboki.eportal.bo.EportalLoginBo;
import com.chenxc.cxcboki.eportal.dto.req.EportalLoginReqDTO;
import com.chenxc.cxcboki.eportal.dto.res.EportalLoginResDTO;
import com.chenxc.cxcboki.eportal.service.EportalLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:20
 */
@Service(interfaceClass = EportalLoginService.class)
public class EportalLoginServiceImpl implements EportalLoginService {
    private static final Logger logger = LoggerFactory.getLogger(EportalLoginServiceImpl.class);

    @Resource
    EportalLoginBo eportalLoginBo;

    @Override
    public EportalLoginResDTO eportalLogin(EportalLoginReqDTO eportalLoginReqDTO) {
        logger.info("调用eportalLogin入参"+ JSONObject.toJSONString(eportalLoginReqDTO));
        EportalLoginResDTO eportalLoginResDTO = new EportalLoginResDTO();
        try{
            eportalLoginResDTO = eportalLoginBo.eportalLogin(eportalLoginReqDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        return eportalLoginResDTO;
    }
}
