package com.hibernate;

import com.entity.Car;
import com.entity.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver1T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setup connection to DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");

		System.out.println(factory);

		// to perform crud operation
		EntityManager manager = factory.createEntityManager();
//				System.out.println(manager + " database created");

		// commit
		EntityTransaction transaction = manager.getTransaction();

//************************insert******************************

		Car car = new Car();
		car.setId(10001);
		car.setName("TATA");
		car.setPrice(989000);

		Engine engine = new Engine();
		car.setEngine(engine);
		engine.setEid(1000001);
		engine.setFuel("EV");
		engine.setCc(4800);

		transaction.begin();
		manager.persist(engine);
		manager.persist(car);
		transaction.commit();

//************************fetch***********************

//		Car c1 = manager.find(Car.class, 102);
//		if (c1 != null) {
//			System.out.println(c1);
//			Engine e1 = c1.getEngine();
//			System.out.println(e1);
//		}
////************************Deleting engine*********************
//		transaction.begin();
//		Engine e = manager.find(Engine.class, 1001);
//		Car car = manager.find(Car.class, 101);
//		if (car != null) {
//			Engine e1 = car.getEngine();
//			car.setEngine(null);
//			manager.remove(car);
//			transaction.commit();
//		}
//
////*************************Deleting car*********************
//		transaction.begin();
//		Car car1 = manager.find(Car.class, 10.1);
//		if (car != null) {
//			manager.remove(car1);
//			transaction.commit();
//		}
//
//		transaction.begin();
//		Car c2 = manager.find(Car.class, 102);
//		if (c2 != null) {
//			c2.setPrice(1209999);
//			Engine e2 = c2.getEngine();
//			e2.setFuel("Hybrid");
//			transaction.commit();
//		}

	}

}
