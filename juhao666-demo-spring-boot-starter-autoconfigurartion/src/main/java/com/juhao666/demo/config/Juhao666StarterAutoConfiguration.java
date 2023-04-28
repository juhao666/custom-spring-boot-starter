package com.juhao666.demo.config;

import com.juhao666.demo.bean.HelloProperties;
import com.juhao666.demo.services.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class) //将HelloProperties放入到容器中
public class Juhao666StarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        return helloService;
    }
}
