package io.rcardin.propertiesplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(IntegrationsConfiguration.class)
public class PropertiesPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesPlaygroundApplication.class, args);
	}

}
