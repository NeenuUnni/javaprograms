package demoPrograms;

public class SimpleSwap {
	
	public static void main(String args[]) {
		int x = 4, y = 8, temp;
		
	System.out.println("Before swapping, the numbers are:" + x +" " + y);
	   temp = x;
	   x = y;
	   y = temp;
	   
	System.out.println("After swapping, the numbers are:" + x + " " + y);   
	}
}
