package com.juhao666.demo.services;

import com.juhao666.demo.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * 不能放入容器中
 */
public class HelloService {


    @Autowired
    private HelloProperties helloProperties;

    public  String say(String name){
        return helloProperties.getPrefix() +" " + name + ", " + helloProperties.getSuffix();
    }
}
