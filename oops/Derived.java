package oops;

abstract class Base{
	
	Base(){
		System.out.println("Base class");
	}
	abstract void fun();
}
public class Derived {
	
	Derived(){
		System.out.println("Derived class");
	}
	
	void fun() {
		System.out.println(" Drived fun() called ");
	}

}
