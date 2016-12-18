package readingAss1_97_java_KThomas2;


import java.text.*;

/**
 * @author Ken
 *
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##.##");
		Account account = new Account (1122,20000);
		account.setAnnualInterestRate(3.2);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance is: " + df.format(account.getBalance()));
		System.out.println("Monthly interest is:" + df.format(account.getMonthlyInterestRate()));
		System.out.println("Account created date: " + account.getDateCreated().toString());
	}

}
