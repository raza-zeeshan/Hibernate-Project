package com.hibernate;

import com.entity.Product;
import com.entity.Reviews;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DriverMT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Product product = new Product();
		product.setPid(101);
		product.setPname("TV");
		product.setPrice(456987);

		Reviews reviews = new Reviews();
		reviews.setRid(1);
		reviews.setMsg("4k ultra display");
		reviews.setProduct(product);

		Reviews reviews1 = new Reviews();
		reviews1.setRid(2);
		reviews1.setMsg("Slim light weight");
		reviews1.setProduct(product);
		Reviews reviews2 = new Reviews();
		reviews2.setRid(3);
		reviews2.setMsg("Dollby atmos sound quality");
		reviews2.setProduct(product);

		transaction.begin();
		manager.persist(product);
		manager.persist(reviews2);
		manager.persist(reviews1);
		manager.persist(reviews);

		transaction.commit();

	}

}
