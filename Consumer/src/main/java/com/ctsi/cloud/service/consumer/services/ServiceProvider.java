package com.ctsi.cloud.service.consumer.services;

import com.ctsi.cloud.service.consumer.services.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by doulala on 2016/11/2.
 */


@FeignClient(name = "service-provider",fallback= ServiceProviderHystrix.class)
//@RequestMapping(value = "/provider")
public interface ServiceProvider {

    @RequestMapping(method = RequestMethod.GET, value = "/provider/{id}")
    User getUser(@PathVariable("id") String id);
    @RequestMapping("/provider/from")
    String from();
}
