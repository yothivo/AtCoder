package aoj;

import java.util.Scanner;

public class ITP1_4_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			if (op.equals("+")) {
				System.out.println(a + b);
			} else if (op.equals("-")) {
				System.out.println(a - b);
			} else if (op.equals("*")) {
				System.out.println(a * b);
			} else if (op.equals("/")) {
				System.out.println(a / b);
			} else if (op.equals("?")) {
				break;
			}
		}

		sc.close();

	}

}
