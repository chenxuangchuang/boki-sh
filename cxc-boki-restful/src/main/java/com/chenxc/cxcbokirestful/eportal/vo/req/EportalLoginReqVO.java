package com.chenxc.cxcbokirestful.eportal.vo.req;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:25
 */
@Data
public class EportalLoginReqVO implements Serializable {
    private String userName;

    private String userPass;
}
