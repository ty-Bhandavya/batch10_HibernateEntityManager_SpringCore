package com.te.HibernateSpring.bean;

import javax.persistence.EntityManager;

import lombok.Data;

@Data
public class EntityManagerDemo {
	private EntityManager entityManager;
}
