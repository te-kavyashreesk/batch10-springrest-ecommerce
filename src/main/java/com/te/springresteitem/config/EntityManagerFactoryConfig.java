package com.te.springresteitem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;


@Configuration
public class EntityManagerFactoryConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEMFO() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("cart");
		return factoryBean;
	}

}