package atm;
import javax.swing.JOptionPane;

/**
 * This is a class that performs banking transactions
 * @author Xiang Mao 20251952
 * @version 1.0
 * @since 10 Feb 2020
 *
 */
public class Transactions
{
	/**
	 * answer1 attribute Whether to deposit or not
	 */
	public int answer1;
	
	/**
	 * answer2 attribute Whether to withdraw money
	 */
	public int answer2;
	
	/**
	 * amount attribute Operation amount
	 */
	public int amount;
	
	/**
	 * Withdrawal operation 
	 */
	public boolean withdrawOK = true;
	
	/**
	 * Bank Account
	 */
	public BankAccount ba;
    
	/**
	 * Constructors, initialization operations
	 */
	public Transactions() {
    	answer1=0;
    	answer2=0;
    	amount=0;
    	ba = new BankAccount(1000);
    	
    }
    
	
	/**
	 * The main function, after displaying the interface, requires the user to select the operation and enter the amount
	 * @param args
	 */
	public static void main(String[] args)
	{
	  Transactions transaction = new Transactions();
	  transaction.getInput();
	  System.exit(0);
		  
	  }
	   
	/**
	 * Read the user's operation
	 */
   public void getInput() {	   
	   answer1 = JOptionPane.showConfirmDialog(null,
	                "Make a Depoist?", null, JOptionPane.YES_NO_OPTION);
	     
	   if (answer1 == JOptionPane.YES_OPTION){
	    	  String depString =
	    		         JOptionPane.showInputDialog(
	    		                               "Enter amount:");
	    	  amount = Integer.parseInt(depString);
	    	 
	    	  //deposit an amount in the account
	    	  ba.deposit(amount);
	    		     
	      }
	   
	   else if (answer1 == JOptionPane.NO_OPTION){
		   answer2 = JOptionPane.showConfirmDialog(null,
	                "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
	   
		   if (answer2 == JOptionPane.YES_OPTION){
		    	  String withString =
		    		         JOptionPane.showInputDialog(
		    		                               "Enter amount:");
		    	  amount = Integer.parseInt(withString);
		    	  
		   //withdraw an amount from the account 	  
	    	  ba.withdraw(amount);
	   
	   }
		 
			
	   }
	   if (!withdrawOK)
		   JOptionPane.showMessageDialog(
			         null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");
	   else
		   JOptionPane.showMessageDialog( 
				     null, " Your balance is " + ba.getBalance());

		      	   
	      }
}


