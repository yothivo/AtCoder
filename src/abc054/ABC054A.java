package abc054;

import java.util.Scanner;

public class ABC054A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 1) {
			a = 14;
		}
		if (b == 1) {
			b = 14;
		}

		if (a > b) {
			System.out.println("Alice");
		} else if (a < b) {
			System.out.println("Bob");
		} else {
			System.out.println("Draw");
		}

		sc.close();
	}

}
