package Aggregation;

import java.util.Scanner;

public class Student {
	
String name;
int rollno;
	
	void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.next();
		
		System.out.println("Enter the roll number:");
		rollno = sc.nextInt();
	}	
}
