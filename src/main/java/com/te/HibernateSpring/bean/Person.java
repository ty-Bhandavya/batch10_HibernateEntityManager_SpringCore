package com.te.HibernateSpring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	

}
