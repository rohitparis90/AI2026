package javaPackage;

public class LoopConcept {

	public static void main(String[] args) {

		// for loop
		for (int i = 1; i < 5; i++) {
			System.out.println(i);

		}
		System.out.println("====End of Program====");

		// for each array - for array traversing
		Object a[] = { "Selenium", 10.5, 3 > 12, 'c', 5 };
		// System.out.println(a.length);

		int count = 0;// Local Variable
		// Print an array using for loop
		for (Object b : a) {
			if (count == 3) { // if (count < 3)
				break;
			}
			System.out.println(b);
			count++;

		}
		System.out.println("====End of for each Loop====");

		// While Loop
		int i = 10;
		while (i < 15 & i < 12) {

			System.out.println(i);
			i++;
		}
		System.out.println("====End of while Loop====");

		//do while Loop
		int d = 1;//Local Variable
		do {

			System.out.println(d);
			d++;
		}while (d < 5);
		System.out.println("====end of do while Loop");


	}

}

/*
 * package javaPackage;
 *
 * public class LoopConcept {
 *
 * public static void main(String[] args) {
 *
 * // for loop for (int i = 1; i <= 5; i++) { System.out.println(i); }
 * System.out.println("=====End of for loop=====");
 *
 * // for each loop - for array traversing Object a[] = { "Selenium", 10.5, 3 >
 * 12, 'c', 5 }; for (Object b : a) { if (b.equals("Selenium")) {
 * System.out.println(b); } else if (b.equals(5)) { System.out.println(b); }
 * else if (b.equals('c')) { System.out.println(b); } }
 * System.out.println("=====End of for each loop=====");
 *
 * }
 *
 * }
 *
 */

/*
 * package javaPackage;
 *
 * public class LoopConcept {
 *
 * public static void main(String[] args) {
 *
 * // for loop for (int i = 1; i <= 5; i++) { System.out.println(i); }
 * System.out.println("=====End of for loop=====");
 *
 * // for each loop - for array traversing Object a[] = { "Selenium", 10.5, 3 >
 * 12, 'c', 5 }; for (Object b : a) { if (b.equals("Selenium")) {
 * System.out.println(b); } else if (b.equals(5)) { System.out.println(b); }
 * else if (b.equals('g')) { System.out.println(b); } else if (b.equals(3 > 12))
 * { System.out.println(b); } }
 * System.out.println("=====End of for each loop=====");
 *
 * }
 *
 * }
 */
