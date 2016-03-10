package testbase;


import base.Account;
import base.OverDraftException;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	static Account testAccount;
	

	@Before
	public static void setUpBeforeClass() throws Exception {
		testAccount = new Account(1122,20000,4.5);
		
	}

	@After
	public static void tearDownAfterClass() throws Exception {
		testAccount = null;
	}

	

	@Test
	public void testOne() throws OverDraftException{
		testAccount.withdraw(2500);
		testAccount.deposit(3000);
	}

	

}
