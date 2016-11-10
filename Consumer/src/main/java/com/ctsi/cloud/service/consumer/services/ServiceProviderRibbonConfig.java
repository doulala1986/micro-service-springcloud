package com.ctsi.cloud.service.consumer.services;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;

/**
 * Created by doulala on 2016/11/4.
 */
public class ServiceProviderRibbonConfig {
    @Bean
    public IRule ribbonRule() {
        RetryRule rule = new RetryRule();
        rule.setMaxRetryMillis(5000);
        return rule;
//        return new BestAvailableRule();
    }
}
