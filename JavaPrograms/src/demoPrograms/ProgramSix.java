//WAP to find season using Switch statement

package demoPrograms;

public class ProgramSix {
	
	public static void main (String args[]){

		int season = 7;

		switch (season){

		case 12:
		case 1:
		case 2:
		System.out.println("The season is Winter");
		break;

		case 3:
		case 4:
		case 5:
		System.out.println("The season is Spring");
		break;

		case 6:
		case 7:
		case 8:
		System.out.println("The season is Summer");
		break;

		case 9:
		case 10:
		case 11:
		System.out.println("The season is Autumn");
		break;

		default:
		System.out.println("Invalid entry");
		}
	}
}
