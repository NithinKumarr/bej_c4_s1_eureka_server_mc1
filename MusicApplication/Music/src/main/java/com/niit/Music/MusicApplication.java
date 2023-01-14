package com.niit.Music;

import com.niit.Music.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@SpringBootApplication
public class MusicApplication {

	public static void main(String[] args) {

		SpringApplication.run(MusicApplication.class, args);

	}
	@Bean
	public FilterRegistrationBean jwtFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.addUrlPatterns("/api/v1/*");
		return filterRegistrationBean;
	}

}
