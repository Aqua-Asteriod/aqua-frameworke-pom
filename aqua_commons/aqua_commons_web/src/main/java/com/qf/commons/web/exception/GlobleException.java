package com.qf.commons.web.exception;

import com.qf.commons.web.base.R;
import com.qf.commons.web.base.RetUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
@RestControllerAdvice
public class GlobleException {

    @ExceptionHandler
    public R exceptionHandler(Throwable t){
        return RetUtils.creat(500,"服务器异常",null);
    }
}
