package Abstraction;

public abstract class AbstInfo {
	
	AbstInfo(){
		System.out.println("Parent class default const");
	}
	
	public abstract void getName(String name);
	public abstract void getAge(int age);
	
}
