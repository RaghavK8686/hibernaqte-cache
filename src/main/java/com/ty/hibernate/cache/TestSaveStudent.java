package com.ty.hibernate.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.cache.spi.support.EntityTransactionalAccess;

public class TestSaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Dimple");
		
		Student student2=new Student();
		student2.setId(2);
		student2.setName("Chinnu");
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();
	}

}
