package com.te.HibernateSpring.config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.HibernateSpring.bean.EntityManagerDemo;

@Configuration
public class ConfigEntityManger {
	@Bean
	public EntityManagerDemo getEntityManagerDemo() {
		EntityManagerDemo entityManagerDemo = new EntityManagerDemo();
		entityManagerDemo.setEntityManager(Persistence.createEntityManagerFactory("Test").createEntityManager());
		return entityManagerDemo;
	}
}
