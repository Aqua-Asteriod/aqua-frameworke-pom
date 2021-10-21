package com.qf.commons.db.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pww
 * @date 2021/10/20
 * @apiNote
 */
@Configuration
@MapperScan("com.qf.data")
public class MyDataBaseConfigration {
}
