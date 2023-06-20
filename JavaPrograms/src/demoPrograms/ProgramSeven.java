// Convert the following if-else-if construct to switch
// if(var==1); print:good, else if(var==2); print: better, else if(var==3); print:best
// else; print: invalid

package demoPrograms;

public class ProgramSeven {
	
	public static void main(String args[]) {

		int a = 2;

		switch(a) {

		case 1:
		System.out.println("good");
		break;

		case 2:
		System.out.println("better");
		break;

		case 3:
		System.out.println("best");
		break;

		case 4:
		System.out.println("invalid");
		break;
		}
	}
}
