package com.ctsi.cloud.zuul.filters;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by doulala on 2016/11/4.
 */
@Configuration
public class ZuulFilterConfiguration {
    @Bean
    public ZuulFilter preFilter()
    {
        return new AccessFilter();
    }
    @Bean
    public ZuulFilter pre2Filter()
    {
        return new AccessFilter2();
    }
    @Bean
    public ZuulFilter postZuulFilter()
    {
        return new PostFilter();
    }
}
