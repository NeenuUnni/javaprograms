package Aggregation;

import java.util.Scanner;

public class StudDet {
	
String add1,add2,city;	
	
	void getAddress()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the address:");
		add1 = sc.next();
		
		System.out.println("Enter address2:");
		add2 = sc.next();
		
		System.out.println("Enter the city:");
		city = sc.next();
	}
	
public static void main(String args[])
{
	Student st = new Student();
	st.getDetails();
	StudDet sd = new StudDet();
	sd.getAddress();
	
	System.out.println("*****Inputed Student Details*****");
	System.out.println("Name:" +st.name);
	System.out.println("Roll Number:" +st.rollno);
	System.out.println("Address 1:" +sd.add1);
	System.out.println("Address 2:" +sd.add2);
	System.out.println("City:" +sd.city);
}
}