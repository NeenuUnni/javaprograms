// WAP to check whether the number is even and if even, check whether the num is divisible
// by 6 and if num is odd, check whether it is divisible by 3 using Nested-if

package demoPrograms;

public class ProgramTwo {
	public static void main(String args[]) {
		int x = 33;
		
	if(x%2 == 0) {
		if(x%6 == 0) {
			System.out.println("The number is even and is divisible by 6");
		}
	}
	
	else if(x%2 != 0) {
		if(x%3 == 0) {
			System.out.println("The number is odd and is divisible by 3");
		}
	}
	}

}
