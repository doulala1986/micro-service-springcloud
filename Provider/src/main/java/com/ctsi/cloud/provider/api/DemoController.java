package com.ctsi.cloud.provider.api;
import com.ctsi.cloud.provider.model.User;
import com.ctsi.cloud.provider.properties.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by doulala on 2016/11/1.
 */
@RefreshScope
@RestController
@RequestMapping(value = "/provider")
public class DemoController {

    //normal rest api
    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
        return new User(id, "liyao");
    }

    // Normal Config
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }


    //Auto Config
    @Autowired
    private DemoProperties demoProperties;
    @RequestMapping("/name")
    public String name() {
        return demoProperties.getName();
    }
}
