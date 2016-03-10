package testbase;


import base.Account;
import base.OverDraftException;
import static org.junit.Assert.*;


import org.junit.After;

import org.junit.Before;

import org.junit.Test;

public class AccountTest {
	Account testAccount;
	Account testForOD;
	

	@Before 
	public  void setUpBeforeClass() throws Exception {
		testAccount = new Account(1122,20000,4.5);
		testForOD = new Account();
		
	}

	@After
	public  void tearDownAfterClass() throws Exception {
		testAccount = null; 
		testForOD = null;
	}

	

	@Test
	public void testOne() throws OverDraftException {
		testAccount.withdraw(2500);
		assertEquals(testAccount.getBalance(), 17500,0);
		testAccount.deposit(3000);
		assertEquals(testAccount.getBalance(),20500,0);
		
		
		System.out.print("Balance: " + testAccount.getBalance() + "\n" +
						"Monthly Interest: " + testAccount.getMonthlyInterestRate() + "\n" +
						"Date Created: " + testAccount.getDateCreated());
		System.out.print("\n" + "---------------------------overdraft test-----------------------------" + "\n");
	
	}
	
	
	
	@Test
	public  void testTwo(){
		try{
		
		testForOD.withdraw(7);
		/*
		 * withdraw $7.00 from the account, I don't have $7.00 because I 
		 * spent all my money on coffee at the pod while I was up making this beautiful program
		 */ 
		
		
		}
		catch(OverDraftException e){
			System.out.println("\n" + "Overdraft Error!");
			
		}
	
		
		
		
	}
	

}
