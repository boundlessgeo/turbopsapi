package com.boundlessgeo.ps.turbopsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication
public class TurbopsapiApplication extends ResourceServerConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(TurbopsapiApplication.class, args);
	}
}
