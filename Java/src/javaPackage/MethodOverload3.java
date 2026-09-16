package javaPackage;

public class MethodOverload3 extends MethodOverload2 {

	public static void main(String[] args) {

		MethodOverload3 mo3 = new MethodOverload3();
		mo3.sum(25, 23);//48
		mo3.sum(15, 15, 15);//45

	}

}
