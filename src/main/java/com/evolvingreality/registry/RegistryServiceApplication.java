package com.evolvingreality.registry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Stand alone registration and discovery server for microservice architecture.
 * @author Derek Reynolds
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RegistryServiceApplication.class).web(true).run(args);
	}
}
