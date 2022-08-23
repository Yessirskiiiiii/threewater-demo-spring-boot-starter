package com.threewater.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: yessirskiii
 * @Date: 2022/08/22/16:17
 * @Description: starter 的参数类，读取配置文件的参数
 */
@Component
@ConfigurationProperties(prefix = "threewater")
public class ThreewaterProperties {

    /**
     * 需要被分隔的字符串
     */
    private String string;

    /**
     * 分隔符
     */
    private String delimiter;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
