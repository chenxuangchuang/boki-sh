package com.chenxc.cxcboki.message.service;

import com.chenxc.cxcboki.message.dto.req.SendMessageReqDTO;
import com.chenxc.cxcboki.message.dto.res.SendMessageResDTO;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/12/31 14:38
 */
public interface MessageService {

    public SendMessageResDTO sendMessage(SendMessageReqDTO sendMessageReqDTO);
}
