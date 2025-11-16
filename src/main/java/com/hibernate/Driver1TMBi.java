
package com.hibernate;

import com.entity.Accounts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver1TMBi {

	public static void main(String[] args) {
		// setup connection to DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");

		// to perform crud operation
		EntityManager manager = factory.createEntityManager();

		// commit
		EntityTransaction transaction = manager.getTransaction();
////------------------insert------------------------
//		Bankk bankk = new Bankk();
//		bankk.setId(1);
//		bankk.setName("SBI");
//
//		Accounts ac1 = new Accounts();
//		ac1.setAcid(101);
//		ac1.setAcname("zeeshan");
//		ac1.setAcbal(125469);
//		ac1.setBankk(bankk);
//
//		Accounts ac2 = new Accounts();
//		ac2.setAcid(102);
//		ac2.setAcname("Anuska");
//		ac2.setAcbal(125469);
//		ac2.setBankk(bankk);
//
//		List<Accounts> acc = new ArrayList<Accounts>();
//		acc.add(ac2);
//		acc.add(ac1);
//
//		bankk.setAccounts(acc);
//
//		transaction.begin();
//		manager.persist(bankk);
//		transaction.commit();

//--------------fetch accounts------------------
//		Accounts accounts = manager.find(Accounts.class, 101);
//
//		if (accounts != null) {
//			System.out.println(accounts.getAcid() + " " + accounts.getAcname() + " " + accounts.getAcbal());
//			Bankk bankk2 = accounts.getBankk();
//			System.out.println(bankk2.getName());
//
//		}
//
//		Bankk bankk = manager.find(Bankk.class, 1);
//		if (bankk != null) {
//			System.out.println(bankk.getName());
//			List<Accounts> accounts2 = bankk.getAccounts();
//			for (Accounts accounts3 : accounts2) {
//				System.out.println(accounts3.getAcid() + " " + accounts3.getAcname());
//			}
//		}

//----------------------------delete Accounts---------------------
//		transaction.begin();
//		Accounts accounts2 = manager.find(Accounts.class, 101);
//		if (accounts2 != null) {
//
//			manager.remove(accounts2);
//			transaction.commit();
//		}

//----------------update---------------------
//		transaction.begin();
//		Bankk bankk = manager.find(Bankk.class, 1);
//
//		if (bankk != null) {
//			bankk.setName("HDFC");
//			List<Accounts> accounts = bankk.getAccounts();
//			for (Accounts accounts2 : accounts) {
//				if (accounts2.getAcid() == 102)
//					accounts2.setAcname("Partibha");
//			}
//			manager.merge(bankk);
//			transaction.commit();
//		}

//		transaction.begin();

//		Bankk bankk1 = manager.find(Bankk.class, 1);
//		if (bankk1 != null) {
//			bankk1.setName("Axis");
//			manager.merge(bankk1);
//			transaction.commit();
//		}
//
		transaction.begin();
		Accounts accounts = manager.find(Accounts.class, 102);
		if (accounts != null) {
			accounts.setAcname("Puman");
			manager.merge(accounts);
			transaction.commit();
		}

	}

}
