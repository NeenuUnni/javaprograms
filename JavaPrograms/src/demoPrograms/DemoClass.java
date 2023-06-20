package demoPrograms;

import inheritance.Example;
import inheritance.Fruits;

public class DemoClass extends Fruits{

	public static void main(String args[]) {
		Example e = new Example();
		DemoClass d = new DemoClass();
		
		System.out.println(d.p);
	}
}
