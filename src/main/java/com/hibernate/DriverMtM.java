package com.hibernate;

import java.util.List;

import com.entity.Students;
import com.entity.Subjects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DriverMtM {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

//********************insert students and subjects*********************
//		Students students1 = new Students();
//
//		students1.setId(103);
//		students1.setName("Atul");
//		students1.setAge(42);

//		Subjects subjects = new Subjects();
//		subjects.setSid(1);
//		subjects.setSname("java");
//		subjects.setDuration(120);
//
//		Subjects subjects2 = new Subjects();
//		subjects2.setSid(2);
//		subjects2.setSname("SQL");
//		subjects2.setDuration(45);

//		Subjects subjects = new Subjects();
//		subjects.setSid(3);
//		subjects.setSname("Apti");
//		subjects.setDuration(30);
//
//		Subjects s1 = manager.find(Subjects.class, 1);
//		Subjects s2 = manager.find(Subjects.class, 2);
//
//		ArrayList<Subjects> subs = new ArrayList<Subjects>();
//
//		subs.add(s1);
//		subs.add(s2);
//		subs.add(subjects);
//
//		students1.setSubjects(subs);
//
//		transaction.begin();
//		manager.persist(students1);
//		manager.persist(s1);
//		manager.persist(s2);
//		manager.persist(subjects);
//		transaction.commit();

//*********************fetch studet data*******************************
//		Students students = manager.find(Students.class, 103);
//		if (students != null) {
//			System.out.println(students);
//			System.out.println("subjects studied by " + students.getName());
//			List<Subjects> list = students.getSubjects();
//			for (Subjects subjects2 : list) {
//				System.out.println(subjects2);
//
//			}
//		}

//*******************update the data*******************************
//		Students students = manager.find(Students.class, 102);
//		if (students != null) {
//			students.setAge(24);
//			students.setName("Manu");
//
//			List<Subjects> subjects = students.getSubjects();
//			for (Subjects s : subjects) {
//				if (s.getSname().equals("SQL")) {
//					s.setSname("Hibernate");
//					transaction.begin();
//					manager.merge(s);
//					transaction.commit();
//				}
//
//			}
//
//			transaction.begin();
//			manager.merge(students);
//
//			transaction.commit();
//			System.out.println(students);
//		}

//***********************delete the student data***********************
//		Students student = manager.find(Students.class, 103);
//		if (student != null) {
//			transaction.begin();
//			manager.remove(student);
//			transaction.commit();
//		}

//*************delete the subject data ***********************************

//*****************************add subject in existing student******************************

		Subjects subjects = new Subjects();
		subjects.setSid(4);
		subjects.setSname("Spring");
		subjects.setDuration(45);

		transaction.begin();
		Students students2 = manager.find(Students.class, 101);

		if (students2 != null) {
			List<Subjects> subjects2 = students2.getSubjects();
			subjects2.add(subjects);

			students2.setSubjects(subjects2);
			manager.persist(subjects);
			manager.persist(students2);
			transaction.commit();
		}

	}

}
