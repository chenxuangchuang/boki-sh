package com.chenxc.cxcbokirestful.eportal.controller.base;

import com.chenxc.cxcbokirestful.eportal.controller.base.dto.ResultModel;
import com.chenxc.cxcbokirestful.eportal.controller.base.util.JsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * @author chenxc
 * @date 2021/7/8 9:27
 */
public class BaseRestfulController {

    public final Logger logger = LogManager.getLogger("fileLogger");


    public ResponseEntity<ResultModel> resultResponse(Object... dto) {
        logger.info("resultResponse:"+ JsonUtils.getJson(dto));
        if(null!=dto && dto.length>0){
            return new ResponseEntity<ResultModel>(ResultModel.ok(dto[0]), HttpStatus.OK);
        }else{
            return new ResponseEntity<ResultModel>(ResultModel.ok(null), HttpStatus.OK);
        }
    }


}
