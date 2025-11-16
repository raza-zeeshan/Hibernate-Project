package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import com.entity.Account;
import com.entity.Bank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver1Tm {

	public static void main(String[] args) {

		// setup connection to DB
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("zeeshan");

		System.out.println(factory);

		// to perform crud operation
		EntityManager manager = factory.createEntityManager();
//				System.out.println(manager + " database created");

		// commit
		EntityTransaction transaction = manager.getTransaction();

//************************insert******************************

		Bank bank = new Bank();
		bank.setBid(3);
		bank.setBname("AXis");

		Account ac1 = new Account();
		ac1.setAcid(2001);
		ac1.setAcname("Crark Kent");
		ac1.setAcbal(560000);

		Account ac2 = new Account();
		ac2.setAcid(2002);
		ac2.setAcname("Allen Cooper");
		ac2.setAcbal(63000);

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(ac1);
		accounts.add(ac2);

		transaction.begin();
		bank.setAccounts(accounts);
		manager.persist(ac1);
		manager.persist(ac2);
		manager.merge(bank);

		transaction.commit();

//********************************update and fetch***********************

//		Bank b = manager.find(Bank.class, 0);
//		Account a = manager.find(Account.class, 101);
//		if (b != null) {
//			transaction.begin();
//			b.setBname("AXIS");
//			b.setBid(3);
//			manager.merge(b);
//			transaction.commit();
//			System.out.println(b);
//			System.out.println("-------------------------------------------------------");
//			List<Account> accs = b.getAccounts();
//			for (Account acc : accs) {
//				System.out.println(acc);
//			}
//
//		}
//
////********************add account in exixting Bank**********************
//
//		Account acc = new Account();
//		acc.setAcid(104);
//		acc.setAcname("Muskan M");
//		acc.setAcbal(29645);
//
//		transaction.begin();
//		Bank b = manager.find(Bank.class, 1);
//		if (b != null) {
//
//			List<Account> accs = b.getAccounts();
//			accs.add(acc);
//			b.setAccounts(accs);
//			manager.merge(b);
//			transaction.commit();
//		}
//
////***********************removing bank removes accounts**********************
//
//		transaction.begin();
//		Bank b = manager.find(Bank.class, 2);
//
//		if (b != null) {
//			manager.remove(b);
//			transaction.commit();
//		}
//
////********************remove-individual-accounts************************
//
//		transaction.begin();
//		Bank b = manager.find(Bank.class, 2);
//
//		if (b != null) {
//			Account account = manager.find(Account.class, 201);
//			if (account != null)
//				b.getAccounts().remove(account);
//			manager.remove(account);
//			manager.merge(b);
//			transaction.commit();
//		}

	}

}
