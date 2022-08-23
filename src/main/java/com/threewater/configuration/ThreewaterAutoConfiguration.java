package com.threewater.configuration;

import com.threewater.properties.ThreewaterProperties;
import com.threewater.service.ThreewaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yessirskiii
 * @Date: 2022/08/22/16:55
 * @Description: starter 自动配置类
 */
@Configuration
@ConditionalOnClass(ThreewaterProperties.class)
@EnableConfigurationProperties(ThreewaterProperties.class)
public class ThreewaterAutoConfiguration {

    @Autowired
    private ThreewaterProperties threewaterProperties;

    @Bean
    @ConditionalOnMissingBean(ThreewaterService.class)
    public ThreewaterService threewaterService() {
        return new ThreewaterService(threewaterProperties);
    }

}
