package com.threewater.service;

import com.threewater.properties.ThreewaterProperties;

/**
 * @Author: yessirskiii
 * @Date: 2022/08/22/16:45
 * @Description: starter 的功能业务类，将配置文件中传入的 string 根据配置文件中传入的分隔符分隔
 */
public class ThreewaterService {

    private ThreewaterProperties threewaterProperties;

    public ThreewaterService(ThreewaterProperties threewaterProperties) {
        this.threewaterProperties = threewaterProperties;
    }

    public String[] spilt() {
        String string = threewaterProperties.getString();
        String delimiter = threewaterProperties.getDelimiter();
        return string.split(delimiter);
    }

}
