package com.chenxc.cxcbokirestful.common.base.util;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/11/26 11:20
 */
public interface BaseErrorInfo {
    /**
     * 错误码
     *
     * @return java.lang.String
     */
    String getResultCode();

    /**
     * 错误信息
     *
     * @return java.lang.String
     */
    String getResultMessage();
}
