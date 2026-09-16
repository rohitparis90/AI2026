package javaPackage;

public class Operator_Logical {

	public static void main(String[] args) {

		int a = 10;// Local Variable
		int b = 5;// Local Variable
		int c = 20;// Local Variable

		// Logical operator- If 1st condition is false, then check 2nd condition
		System.out.println(a < b && a++ < c);//
		System.out.println(a);// 10

		// Logical operator- If 1st condition is false, then check 2nd condition
		System.out.println(a > b && a++ < c);//
		System.out.println(a);// 11

	}

}
