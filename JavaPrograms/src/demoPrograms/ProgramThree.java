//WAP to input total marks of 5 subjects and calculate percentage and grade according to
// percentage

package demoPrograms;

public class ProgramThree {
	
	public static void main(String args[]) {
		int m1 = 80, m2 = 90, m3 = 95, m4 = 85, m5 = 90;
		float total, percen;
		char grade;
		
		total = m1+m2+m3+m4+m5;
		percen = (total/500)*100;
		
	if(percen >= 90) {
		grade = 'A';
	}
		else if(percen >=80 && percen < 90) {
		grade = 'B';
		}
		else if(percen >= 70 && percen < 80) {
			grade = 'C';
		}
		else if(percen >= 60 && percen < 70) {
			grade = 'D';
		}
		else {
			grade = 'E';
		}
	System.out.println("Total marks:" + total);
	System.out.println("Percentage got:" + percen);
	System.out.println("Grade obtained:" + grade);
	}
}