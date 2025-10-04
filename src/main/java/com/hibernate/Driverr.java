package com.hibernate;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driverr {
	static Scanner sc;

	public static void main(String[] args) {

		// setup connection to DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");

		System.out.println(factory);

		// to perform crud operation
		EntityManager manager = factory.createEntityManager();
//		System.out.println(manager + " database created");

		// commit
		EntityTransaction transaction = manager.getTransaction();

//		Student student = new Student();
//		student.setId(106);
//		student.setAge(24);
//		student.setName("Barry Allen");

//		Teacher teacher = new Teacher();

//		teacher.setAge(17);
//		teacher.setId(1002);
//		teacher.setName("Raza");

// --------------persist---------------insert----------
//		transaction.begin();
//		manager.persist(student);
//		manager.persist(teacher);
//		transaction.commit();

//		int id = 103;
//----------------find-----------select-------------
//		Student st = manager.find(Student.class, id);
//
//		if (st != null) {
//			System.out.println("name : " + st.getName());
//		}
// -----------------------remove------delete----------
//		if (st != null) {
//			transaction.begin();
//			manager.remove(st);
//			transaction.commit();
//
//		}

		// ------------------update----------merge---------------
//		transaction.begin();
//		if (st != null) {
//			st.setName("Hendry Cavil");
//			st.setAge(26);
//			manager.merge(st);
//			System.out.println("data updated");
//			transaction.commit();
//		}

		// ------------fetch All data from Database

//		Query query = manager.createQuery("from Student");
//
//		List<Student> resultList = query.getResultList();
//		for (Student student : resultList) {
//			System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
//		}

//		Query query = manager.createQuery("select max(s.age) from Student s ");
//		query.setParameter(1, 25);
//		query.setMaxResults(2);

//		System.out.println(query.getSingleResult());
//		List<Student> resultList = query.getResultList();
//
//		for (Student student : resultList) {
//			System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
//		}

//		boolean flag = true;
//		while (flag) {
//
//			System.out.println("\n--WELCOME TO STUDENT DASHBOARD--");
//			System.out.println("Enter 1 to add student data");
//			System.out.println("Enter 2 to update student data");
//			System.out.println("Enter 3 to delete student data");
//			System.out.println("Enter 4 to fetch student data");
//			System.out.println("Enter 5 to close student data");
//
//			sc = new Scanner(System.in);
//			System.out.println("enter your choice");
//			int choice = sc.nextInt();
//
//			switch (choice) {
//			case 1: {
//				Student student = new Student();
//				System.out.println("enter id:");
//				int id1 = sc.nextInt();
//				System.out.println("enter Name");
//				String name1 = sc.next();
//				System.out.println("enter age");
//				int age1 = sc.nextInt();
//
//				student.setId(id1);
//				student.setAge(age1);
//				student.setName(name1);
//
//				transaction.begin();
//				manager.persist(student);
//				transaction.commit();
//				System.out.println("data saved!");
//
//			}
//				break;
//
//			case 2: {
//				System.out.println("enter the id you want to update");
//				int id1 = sc.nextInt();
//				Student st = manager.find(Student.class, id1);
//				if (st != null) {
//					transaction.begin();
//					String name = sc.next();
//					st.setName(name);
//					manager.merge(st);
//					transaction.commit();
//					System.out.println("data updated!!!");
//
//				} else {
//					System.out.println("invalid id");
//				}
//
//			}
//				break;
//
//			case 3: {
//				System.out.println("enter the id you want to delete");
//				int id1 = sc.nextInt();
//				Student st = manager.find(Student.class, id1);
//				if (st != null) {
//					transaction.begin();
//					manager.remove(st);
//					transaction.commit();
//					System.out.println("data deleted!!!");
//				} else {
//					System.out.println("invalid id");
//				}
//
//			}
//				break;
////
//			case 4: {
//				System.out.println("enter the id you want to delete");
//				int id1 = sc.nextInt();
//				Student st = manager.find(Student.class, id1);
//				if (st != null) {
//					System.out.println(st.getId() + " " + st.getName() + " " + st.getAge());
//				} else {
//					System.out.println("invalid id");
//				}
//
//			}
//				break;
//			case 5: {
//				flag = false;
//				System.out.println("------------------Application Close-----------------");
//			}
//				break;
//
//			default:
//				System.out.println("invalid choice entered");
//				break;
//
//			}
//		}
	}

}
