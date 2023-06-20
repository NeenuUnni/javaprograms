package Aggregation;

import java.util.Scanner;

public class Employee {
	float bp,bonus,ded;
	
	void unit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic pay for the employee:");
		bp = sc.nextFloat();
		
		System.out.println("Enter any deduction:");
		ded = sc.nextFloat();
		
		System.out.println("Enter any bonus:");
		bonus = sc.nextFloat();
	}

}
