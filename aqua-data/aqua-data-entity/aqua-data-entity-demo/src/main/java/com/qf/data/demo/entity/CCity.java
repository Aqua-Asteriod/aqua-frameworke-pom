package com.qf.data.demo.entity;

import com.qf.data.basic.entity.BasicEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (CCity)表实体类
 *
 * @author makejava
 * @since 2021-10-20 12:02:02
 */
@Data
@Accessors(chain = true)
public class CCity extends BasicEntity {
    
    private Long cId;
    
    private String cityName;
    
    private String cityPinyin;

}

