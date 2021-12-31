package com.chenxc.cxcbokirestful.common.constant;

import com.chenxc.cxcbokirestful.common.base.util.BaseErrorInfo;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/11/26 11:23
 */
public enum BaseErrorEnum implements BaseErrorInfo {
    // 数据操作定义
    SUCCESS("200", "成功!"),
    BODY_NOT_MATCH("400", "语法格式有误,服务器无法理解此请求!"),
    SIGNATURE_NOT_MATCH("401", "请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    SERVER_BUSY("503", "服务器正忙,请稍后再试!"),
    UNAUTHORIZED("401", "访问该资源需经验证");

    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMessage;

    BaseErrorEnum(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMessage() {
        return resultMessage;
    }
}
