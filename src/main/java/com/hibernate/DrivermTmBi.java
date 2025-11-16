package com.hibernate;

import java.util.Set;

import com.entity.Studentss;
import com.entity.Subjectss;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DrivermTmBi {
	public static void main(String[] args) {
		// setup connection to DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");

		// to perform crud operation
		EntityManager manager = factory.createEntityManager();

		// commit
		EntityTransaction transaction = manager.getTransaction();

//-----------------------insert----------------------------		
//		Studentss std1 = new Studentss();
//		std1.setAge(21);
//		std1.setId(102);
//		std1.setName("Anuska");
//
//		Subjectss sub3 = new Subjectss();
//		sub3.setSid(3);
//		sub3.setSname("SQL");
//		Subjectss sub2 = new Subjectss();
//		sub2.setSid(2);
//		sub2.setSname("Hibernate");
//
//		std1.addSubject(sub3);
//		std1.addSubject(sub2);
//
//		transaction.begin();
//		manager.persist(std1);
//		transaction.commit();

//--------------------------fetch---------------------
//		Studentss std = manager.find(Studentss.class, 102);
//		if (std != null) {
//			System.out.println(std.getId() + " " + std.getName());
//			Set<Subjectss> subjects = std.getSubjects();
//			for (Subjectss subjectss : subjects) {
//				System.out.println(subjectss.getSid() + " " + subjectss.getSname());
//			}
//
//		}

		Subjectss sub = manager.find(Subjectss.class, 2);
		if (sub != null) {
			System.out.println(sub.getSid() + " " + sub.getSname());
			Set<Studentss> stds = sub.getStudents();
			for (Studentss std : stds) {
				System.out.println(std.getId() + " " + std.getName());
			}
		}

	}

}
