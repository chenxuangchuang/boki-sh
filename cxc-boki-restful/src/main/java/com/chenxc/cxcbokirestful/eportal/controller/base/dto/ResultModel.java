package com.chenxc.cxcbokirestful.eportal.controller.base.dto;

import com.chenxc.cxcbokirestful.eportal.controller.base.constant.ENUM_RESTFUL_COMMON_CODE;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/17 23:11
 */
public class ResultModel {
    private int code;
    private String message = "";
    private Object content;

    public ResultModel(int code, String message)
    {
        this.code = code;
        this.message = message;
        this.content = "";
    }

    public ResultModel(int code, String message, Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    public static ResultModel ok(Object content) {
        return new ResultModel(0, "成功", content);
    }

    public static ResultModel ok() {
        return new ResultModel(0, "成功");
    }

    public static ResultModel error(Object[] objects)
    {
        if ((null != objects) && (objects.length == 2)) {
            return new ResultModel(Integer.valueOf(String.valueOf(objects[0])).intValue(), String.valueOf(objects[1]));
        }
        return new ResultModel(ENUM_RESTFUL_COMMON_CODE.SYSTEM_ERROR.getCode(), ENUM_RESTFUL_COMMON_CODE.SYSTEM_ERROR.getMessage());
    }

    public int getCode()
    {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return this.content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
