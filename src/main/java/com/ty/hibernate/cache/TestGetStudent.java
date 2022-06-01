package com.ty.hibernate.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Student student1=entityManager.find(Student.class, 1);
		System.out.println(student1);
		
		Student student2=entityManager.find(Student.class, 1);
		System.out.println(student2);
				
		
	}

}


 
// Using first level cache-----------------------------------
//Hibernate: select student0_.id as id1_0_0_, student0_.name as name2_0_0_ from Student student0_ where student0_.id=?
//Student [id=1, name=Dimple]
//Hibernate: select student0_.id as id1_0_0_, student0_.name as name2_0_0_ from Student student0_ where student0_.id=?
//Student [id=2, name=Chinnu]

//Using second level cache-------------------------------------
//Hibernate: select student0_.id as id1_0_0_, student0_.name as name2_0_0_ from Student student0_ where student0_.id=?
//Student [id=1, name=Dimple]
//Student [id=1, name=Dimple]
