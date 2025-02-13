package oops;

class A {
	A() {
		System.out.println("A class Constructor");
	}
}

class B extends A {
	B() {
		this(10);
		System.out.println("B class default Constructor");
	}

	B(int a) {
		super();
		System.out.println("B cals 2 Constructor");
	}
}

public class Main {

	public static void main(String[] args) {
		B obj = new B();
	}

}
