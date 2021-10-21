package com.qf.commons.web.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
@Data
@Accessors(chain = true)
public class R<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;
}
