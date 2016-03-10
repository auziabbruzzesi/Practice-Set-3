package base;
import java.util.Date;

public class Account {

	private int id = 0;//default value
	private double balance = 0;
	private double annualInterestRate = 0;//--percent val
	private Date dateCreated;
	
	
	
	/*
	 * METHODS
	 */
	
	
	public double getMonthlyInterestRate(){//returns the monthly interest rate
		 
		return (getAnnualInterestRate()/12);
	}
	
	
	
	public void withdraw(double withdrawAmount) throws OverDraftException{
		
			if((getBalance() - withdrawAmount)>=0)
		{
			 balance -= withdrawAmount;
			  
		}
		
		else// if there isn't enough dough, throw an exception
		{
			double difference =( withdrawAmount - balance);
			throw new OverDraftException(difference);
			
		}
	}
			
		
		
	  
	
	/*
	 * add money to the account
	 */
	public void deposit(double depositAmount){
		
		balance += depositAmount;
		
			
		
		
		
	}
	
	
	/*
	 * Setters and Getters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	} 
	

	public Date getDateCreated() {
		return dateCreated;
	}
	//no setter for Date

	/*
	 * NO ARG CONSTRUCTOR
	 */
	public Account(){}

	
	/*
	 * ARG CONSTRUCTOR
	 */
	
	
	public Account(int id, double balance, double annualInterestRate) {
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}
		


	

}
