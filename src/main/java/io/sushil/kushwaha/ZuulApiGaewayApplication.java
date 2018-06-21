package io.sushil.kushwaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import io.sushil.kushwaha.filter.AddResponseHeaderFilter;
import io.sushil.kushwaha.filter.ZuulLoggingFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApiGaewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGaewayApplication.class, args);
	}
	
	@Bean
	public ZuulLoggingFilter defaultSampler() {
		return new ZuulLoggingFilter();
	}
	
	@Bean
	public AddResponseHeaderFilter responseFilter() {
		return new AddResponseHeaderFilter();
	}
}
