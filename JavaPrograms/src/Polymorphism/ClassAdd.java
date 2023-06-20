package Polymorphism;

public class ClassAdd extends Addition{
	
	@Override
	
	public int findSum(int a, int b) {
		return s = a+b+20;
	}

	public static void main(String args[]) {
		Addition ob = new ClassAdd();
		System.out.println(ob.findSum(10,5));
	}
}
