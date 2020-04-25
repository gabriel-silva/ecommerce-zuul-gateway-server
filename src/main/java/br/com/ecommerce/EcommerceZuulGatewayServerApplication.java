package br.com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EcommerceZuulGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceZuulGatewayServerApplication.class, args);
	}

}
