package javaPackage;

public class Operator_Bitwise {

	public static void main(String[] args) {

		int a = 10;//Local Variable
		int b = 5;//Local Variable
		int c = 20;//Local Variable

		//Bitwise operator- It will check all the conditions always
		System.out.println(a < b & a++ < c);//false
		System.out.println(a);//11

	}

}
