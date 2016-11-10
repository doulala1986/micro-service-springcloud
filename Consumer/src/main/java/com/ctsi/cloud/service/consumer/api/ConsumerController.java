package com.ctsi.cloud.service.consumer.api;

import com.ctsi.cloud.service.consumer.services.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by doulala on 2016/11/1.
 */
@RefreshScope
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Autowired
    ServiceProvider provider;

    @RequestMapping("/{id}")
    public String name(@PathVariable("id") String id) {
        return provider.getUser(id).getName();
    }


    @RequestMapping("/loadbalance")
    public String loadbalance() {
        return provider.from();
    }
}
