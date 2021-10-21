package com.qf.commons.web.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */

public enum Code {
    SUCC(200,"成功"),
    SERVER_ERROR(500,"服务器异常，请稍后再试!"),
    PARAM_ERROR(400,"参数校验异常");
    Integer code;
    String msg;

    Code(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
