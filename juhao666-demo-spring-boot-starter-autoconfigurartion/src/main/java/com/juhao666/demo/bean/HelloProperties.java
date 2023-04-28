package com.juhao666.demo.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("juhao666.demo")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
