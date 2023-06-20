package Aggregation;

public class SalaryDet {
	
float salary;

	void getSalary()
	{
Employee em = new Employee();
CalcEmp cm = new CalcEmp();
		
		salary = em.bp + em.bonus + cm.hrac(em.bp)- cm.pfc(em.bp) - em.ded;
	}
	
public static void main(String args[])
{
//	float salary;
	
	Employee em = new Employee();
	em.unit();
	
	CalcEmp cm = new CalcEmp();
//	cm.hrac(em.bp);
//	cm.pfc(em.bp);
	
 //salary = em.bp + em.bonus + cm.hrac(em.bp)- cm.pfc(em.bp) - em.ded;
	
SalaryDet sm = new SalaryDet();
sm.getSalary();
	
	
	System.out.println("*****Salary Slip of the employee*****");
	System.out.println("The Basic Pay is:" +em.bp);
	System.out.println("Bonus for the month:" +em.bonus);
	System.out.println("Deduction for the month:" +em.ded);
	System.out.println("HRA for the month:" +cm.hrac(em.bp));
	System.out.println("PF for the month:" +cm.pfc(em.bp));
	System.out.println("Total salary for the month is" +sm.salary);
}
}
