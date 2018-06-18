package io.sushil.kushwaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApiGaewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGaewayApplication.class, args);
	}
	
	/*@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}*/
}
