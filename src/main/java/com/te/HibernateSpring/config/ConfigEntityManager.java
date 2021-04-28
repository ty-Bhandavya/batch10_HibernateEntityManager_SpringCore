package com.te.HibernateSpring.config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;

import com.te.HibernateSpring.bean.EntityManagerDemo;

public class ConfigEntityManager {
	@Bean
	public EntityManagerDemo getEntityManagerDemo() {
		EntityManagerDemo entityManagerDemo = new EntityManagerDemo();
		entityManagerDemo.setEntityManager(Persistence.createEntityManagerFactory("Map").createEntityManager());
		return entityManagerDemo;
	}
}
