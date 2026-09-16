package javaPackage;

public class Variable9 {

	int b = 10;// Global Variable
	static int c = 15;// Static Variable

	// Static Method
	public static void d() {
		int e = 15; // Local Variable
		System.out.println(e);// 15
	}

	// Non Static Method
	public void f() {
		int g = 11; // Local Variable
		System.out.println(g);// 11

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;// Local Variable
		System.out.println(a);// 6 - Calling Variable

		// Static member calling
		System.out.println(c); // 5 - Calling Variable
		d(); // 15 - Calling Static method directly in the same - predefined rule

		// Non Static member calling
		Variable9 V9 = new Variable9();
		System.out.println(V9.b); // 10-Calling non static Variable
		V9.f();// Calling non static method using class ref - predefined rules

	}

}
