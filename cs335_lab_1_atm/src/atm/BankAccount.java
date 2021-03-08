package atm;

/**
 * This is a class about bank account information
 * @author Xiang Mao 20251952
 * @version 1.0
 * @since 10 Feb 2020
 *
 */
public class BankAccount {

	/**
	 * balance attribute
	 */
    private double balance;

    /**
     * Constructors
     */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * Initial Account Information
	 * @param initialBalance double
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	 * Deposited Funds
	 * @param amount double
	 */
	public void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	
	/**
	 * Withdrawal of funds
	 * @param amount double
	 * @return boolean
	 */
	public boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	
	/**
	 * Get Balance
	 * @return balance double
	 */
	public double getBalance() 
	{ 
		return balance;
	}
}

