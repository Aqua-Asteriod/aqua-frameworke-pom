package com.qf.bussiness.demo.controller;

import com.qf.commons.web.base.R;
import com.qf.commons.web.base.RetUtils;
import com.qf.bussiness.demo.protocol.input.UserInput;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
@RestController
@Log4j2
public class UserController {

    @RequestMapping("/demo")
    public R demo(@Valid UserInput userInput){
        log.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(userInput);
        return RetUtils.creat(200,"就这",userInput);
    }
}
