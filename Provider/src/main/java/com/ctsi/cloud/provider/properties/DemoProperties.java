package com.ctsi.cloud.provider.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by doulala on 2016/11/2.
 */

@Component
@ConfigurationProperties(prefix ="server.demo")
public class DemoProperties {

    String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
