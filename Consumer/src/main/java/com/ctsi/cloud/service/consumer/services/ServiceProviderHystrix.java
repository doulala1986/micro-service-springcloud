package com.ctsi.cloud.service.consumer.services;

import com.ctsi.cloud.service.consumer.services.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by doulala on 2016/11/3.
 */
@Component
public class ServiceProviderHystrix implements ServiceProvider {
    @Override
    public User getUser(@PathVariable("id") String id) {
        User user = new User();
        user.setName("null");
        return user;
    }

    @Override
    public String from() {
        return "error-hystrix";
    }
}
