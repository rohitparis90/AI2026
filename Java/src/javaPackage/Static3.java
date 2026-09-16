package javaPackage;

public class Static3 {

	int roll; // Global Variable
	String name; // Global Variable
	String college = "IIT Bombay";

	public void getResult(int r, String n) {
	roll = r;
	name = n;
	System.out.println(roll + " " + name + " " + college);
	}

	public static void main(String[] args) {
	Static3 s3 = new Static3();
	s3.getResult(1, "John"); // 1 John IIT Bombay
	s3.getResult(2, "Peter"); // 2 Peter IIT Bombay
	s3.getResult(3, "Alex"); // 3 Alex IIT Bombay
	}

	}