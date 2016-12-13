package com.sace;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class DashboardAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardAdminApplication.class, args);
	}
}
