package com.te.HibernateSpring;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.HibernateSpring.bean.EntityManagerDemo;
import com.te.HibernateSpring.bean.Person;
import com.te.HibernateSpring.config.ConfigEntityManager;


public class PersonTest {

	public static void main(String[] args) {
		
		Person person= new Person();
	        person.setPid(10);
	        person.setPname("Nischal");
	        EntityManager entityManager= null;
	        EntityTransaction entityTransaction= null;
	   
	        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigEntityManager.class);
            EntityManagerDemo demo= context.getBean(EntityManagerDemo.class);
            entityManager = demo.getEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(person);
            entityTransaction.commit();
            System.out.println("Record inserted succesfully");
	        
            
	}

}
