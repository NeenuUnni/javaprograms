package demoPrograms;

import java.util.Scanner;

public class PalindromeString {
	
 public static void main(String args[]) {
	 String st, rev = "";
	 Scanner s = new Scanner(System.in);
	 
	System.out.println("Enter a string:");
	st = s.nextLine();
	
	int len = st.length();
	
	for (int i= len - 1; i >= 0; i--)
	rev = rev + st.charAt(i);
	
	if(st.equals(rev))
		System.out.println("The entered string is palindrome");
	else
		System.out.println("The entered string is not palindrome");
		
}
}
