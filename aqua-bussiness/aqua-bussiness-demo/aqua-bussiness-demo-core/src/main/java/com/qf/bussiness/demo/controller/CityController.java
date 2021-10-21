package com.qf.bussiness.demo.controller;

import com.qf.bussiness.demo.service.CCityService;
import com.qf.commons.web.base.R;
import com.qf.commons.web.base.RetUtils;
import com.qf.data.demo.entity.CCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pww
 * @date 2021/10/20
 * @apiNote
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CCityService cityService;

    @RequestMapping("/queryAll")
    public R queryAll(){
        List<CCity> cityList = cityService.list();
        return RetUtils.creat(cityList);
    }
}
