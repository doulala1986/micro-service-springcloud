package com.ctsi.cloud.service.consumer;

import com.ctsi.cloud.service.consumer.services.ServiceProviderRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
@RibbonClient(name = "service-provider", configuration = ServiceProviderRibbonConfig.class)

public class ConsumerApplication {
//  进行全局robbin配置，也可以使用@RibbonClient
//	@Bean
//	public AbstractLoadBalancerRule getAbstractLoadBalancerRule(){
//		return new BestAvailableRule();
////		return new RandomRule();
//	}


	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
