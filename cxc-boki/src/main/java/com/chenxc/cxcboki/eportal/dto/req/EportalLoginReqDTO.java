package com.chenxc.cxcboki.eportal.dto.req;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/24 18:25
 */
@Data
public class EportalLoginReqDTO implements Serializable {
    private String userName;

    private String userPass;
}
