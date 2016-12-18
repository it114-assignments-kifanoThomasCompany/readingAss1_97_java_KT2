package readingAss1_97_java_KThomas2;

import java.util.Date;

/**
 * @author Ken
 *
 */
public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated; // double check when done coding
	
	Account()
	{
		id = 0;
		balance = 0; 
		annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	
	Account(int ID, double BALANCE)
	{
		id = ID;
		balance = BALANCE;
		dateCreated = new Date();
		
	}
	public int getID()
	{
		return id;
	}
	
	public double getBalance()
	{
		return balance;		
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
		
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12.0;
		
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public void deposit (double amount)
	{
		balance = balance + amount;
		
	}
}




