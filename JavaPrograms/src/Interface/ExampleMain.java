package Interface;

public class ExampleMain implements IntExam {
	
	public void print()
	{
		System.out.println("Example for Interface method");
	}

public static void main(String args[]) {
	IntExam ob = new ExampleMain();
	ob.print();
}
}
