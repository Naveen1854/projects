package oops;

import java.util.Scanner;

public class Addition {
	static void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b =sc.nextInt();
//		int a = 15;
//		int b = 20;
		add(a,b);
	}
}
