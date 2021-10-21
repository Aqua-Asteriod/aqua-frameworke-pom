package com.qf.bussiness.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.bussiness.demo.service.CCityService;
import com.qf.data.demo.entity.CCity;
import com.qf.data.demo.mapper.dao.CCityDao;
import org.springframework.stereotype.Service;

/**
 * @author pww
 * @date 2021/10/20
 * @apiNote
 */
@Service
public class CityServiceImpl extends ServiceImpl<CCityDao,CCity> implements CCityService {
}
