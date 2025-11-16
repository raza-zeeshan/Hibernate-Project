
package com.hibernate;

import com.entity.Cars;
import com.entity.Engines;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver1t1Bi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// setup connection to DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");

		System.out.println(factory);

		// to perform crud operation
		EntityManager manager = factory.createEntityManager();
//						System.out.println(manager + " database created");

		// commit
		EntityTransaction transaction = manager.getTransaction();

//******************insertb the record************************
		Cars cars = new Cars();
		cars.setId(3);
		cars.setName("Lamborgini");
		cars.setPrice(759864);
		Engines engines = new Engines();

		engines.setEid(103);
		engines.setFuel("Petrol");
		engines.setCc(4500);

		cars.setEngines(engines);
		engines.setCar(cars);

		transaction.begin();
		manager.persist(cars);
		transaction.commit();

//*********************fetch car data ********************************
//		Cars cars = manager.find(Cars.class, 2);
//		if (cars != null) {
//			System.out.println(cars.getId() + " " + cars.getName() + " " + cars.getEngines().getFuel());
//		}
//*********************fetch engin data*************************

//		Engines engines = manager.find(Engines.class, 102);
//		if (engines != null) {
//			System.out.println(engines.getEid() + " " + engines.getFuel() + " " + engines.getCar().getName());
//			;
//		}

//---------------------delete car data----------------not possible-----------

		// --------deleting car is not possible bcoz of forien key constrains
		// --------but possible if we use cascadetype in car
//		transaction.begin();
//		Cars cars = manager.find(Cars.class, 1);
//		if (cars != null) {
//			manager.remove(cars);
//			transaction.commit();
//		}

//-------------deleting engines data is possible if we do not use cascade type-------//
//		transaction.begin();
//		Engines e = manager.find(Engines.class, 102);
//		if (e != null) {
//
//			manager.remove(e);
//			transaction.commit();
//		}

//-----------------adding engines in existing car--------------
//		Cars cars = manager.find(Cars.class, 2);
//		Engines engines = new Engines();
//		engines.setEid(102);
//		engines.setCc(4500);
//		engines.setFuel("Hybrid");
//		transaction.begin();
//		if (cars != null) {
//			cars.setEngines(engines);
//			engines.setCar(cars);
//			manager.merge(cars);
//			transaction.commit();
//		}

	}

}
