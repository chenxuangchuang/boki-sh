package com.chenxc.cxcbokirestful.message.vo.req;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/12/31 14:25
 */
@Data
public class SendMessageReqVO implements Serializable {

    private String moblie;

    private String userName;

}
