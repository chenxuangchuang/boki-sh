package com.chenxc.cxcbokirestful.eportal.controller.base.util;

import com.alibaba.fastjson.JSONObject;
import com.chenxc.cxcbokirestful.eportal.controller.common.constant.BaseErrorEnum;
import lombok.Data;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/11/26 11:14
 */
@Data
public class ResultBody {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    public ResultBody() {
    }

    public ResultBody(BaseErrorInfo errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMessage();
    }

    /**
     * 成功
     *
     * @return ResultBody
     */
    public static ResultBody success() {
        return success(null);
    }

    /**
     * 成功
     *
     * @param data 回调成功显示数据
     * @return ResultBody
     */
    public static ResultBody success(Object data) {
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(BaseErrorEnum.SUCCESS.getResultCode());
        resultBody.setMessage(BaseErrorEnum.SUCCESS.getResultMessage());
        resultBody.setResult(data);
        return resultBody;
    }

    /**
     * 失败
     *
     * @param errorInfo BaseErrorInfo接口
     * @return ResultBody
     */
    public static ResultBody error(BaseErrorInfo errorInfo) {
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(errorInfo.getResultCode());
        resultBody.setMessage(errorInfo.getResultMessage());
        resultBody.setResult(null);
        return resultBody;
    }

    /**
     * 失败
     */
    public static ResultBody error(String code, String message) {
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(code);
        resultBody.setMessage(message);
        resultBody.setResult(null);
        return resultBody;
    }

    /**
     * 失败
     */
    public static ResultBody error(String message) {
        ResultBody resultBody = new ResultBody();
        resultBody.setCode("-1");
        resultBody.setMessage(message);
        resultBody.setResult(null);
        return resultBody;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
