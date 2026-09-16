package javaPackage;

import org.testng.annotations.Test;

public class TestNG1 {

	public static void main(String[] args) {
		System.out.println("Hello main method");
		
	}
	
	@Test
	public void testMethdo() {
		
		System.out.println("Test Method");
		int a = 5;
		System.out.println(a);//5
	}
}
	

