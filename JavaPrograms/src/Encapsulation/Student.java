package Encapsulation;

public class Student {
	
public static void main(String args[]) 
{
	StudentDet s = new StudentDet();
	Address ad = new Address();
	
	s.setName("Neenu");
	s.setAge(30);
	ad.setLine1("Line 1");
	ad.setLine2("Line 2");
	ad.setPin(123456);
	s.setAddress(ad);
	
System.out.println(s.getAddress().getLine1());
System.out.println(s.getAddress().getLine2());
System.out.println(s.getAddtess().getPin());

System.out.println(s.getName));
System.out.println(s.getAge());
}

}
