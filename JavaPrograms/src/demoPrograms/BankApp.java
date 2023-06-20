package demoPrograms;

import java.util.Scanner;

public class BankApp {
	
	float amount,withd,accbal;
	
float getBalance(float amount)
{
	accbal = amount;
	return accbal;
}

float getDeposit(float amount)
{
	accbal = accbal + amount;
	System.out.println("The amount is deposited successfully");
	System.out.println("Your new account balance is:" +accbal);
	return accbal;
}

float getWithdraw(float amount)
{
	if (accbal > amount) {
		System.out.println("The withdraw applicattion is possible");
	accbal = accbal - amount;
	    System.out.println("The amount has been withdrawn successfully");
	    System.out.println("Your new account balance is:" +accbal);
	    return accbal;
	}   
	 else {
		 System.out.println("Amount is in-sufficient and withdraw is not possible");
		 return accbal;
	 }
		
}

public static void main(String args[]) {
	BankApp ob = new BankApp();
    Scanner sc = new Scanner(System.in);
    
System.out.println("Enter the inputs: 1. Account Balance, 2. Deposit, 3. Withdraw");
  int ch = sc.nextInt();
  
if (ch == 1) {
	System.out.println("Your account balance is:");
	float amount = sc.nextFloat();
	ob.getBalance(ob.amount);
	}
else if(ch == 2) {
	System.out.println("Enter the amount:");
	ob.getDeposit(ob.amount);
    }
else if(ch ==3) {
	System.out.println("Enter the amount:");
	ob.getWithdraw(ob.amount);
	}
else {
	System.out.println("Invalid choice");
}

}
}
