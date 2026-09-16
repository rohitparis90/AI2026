package javaPackage;

public class Array1 {

	public static void main(String[] args) {

		// Declaration if an array
		int a[] = new int[5];

		// Print the length of an array
		System.out.println(a.length);

		// Print the default value of an array
		for (int element : a) {
			System.out.println(element);
		}

		// Assign value of an Array
		a[0] = 65;
		a[1] = 99;
		a[2] = 5;
		a[3] = 10;
		a[4] = 6;

		System.out.println(a[3]);// 10

		// Print all Array elements
		for (int element : a)
			System.out.print(element + " ");

	}

}