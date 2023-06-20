//WAP where we will take age of user and find whether he/she is child, adult or senior
// using if-else-if

package demoPrograms;

public class ProgramFour {
	
	public static void main(String args[]) {
		int age = 40;
		
if(age <= 10) {
	System.out.println("The person is child");
}
else if(age > 10 && age <= 18) {
	System.out.println("The person is a teenager");
}
else if(age > 18 && age <= 60) {
	System.out.println("The person is an adult");
}
else {
	System.out.println("The person is a senior citizen");
}
	}

}
