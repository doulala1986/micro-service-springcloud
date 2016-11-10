package com.ctsi.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
public class EurekaApplication {


	// 配置发现权限
	// @Bean
//    DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() {
//        return new DiscoveryClient.DiscoveryClientOptionalArgs();
//    }

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
