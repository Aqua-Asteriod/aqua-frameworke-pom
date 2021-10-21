package com.qf.commons.web.applicaton;

import com.qf.commons.web.exception.GlobleException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
@Configuration
@ComponentScan("com.qf.bussiness")
public class WebApplication {

    /**
     * 配置全局异常处理工具类
     */
    public GlobleException getGlobleException(){
        return new GlobleException();
    }
}
