package com.stratsys.common;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")

public class PropertyFinder implements EnvironmentAware {

	static Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		PropertyFinder.environment = environment;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public static String getLevel() {
		return environment.getProperty("backend.environment.level");
	}

}