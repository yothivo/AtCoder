package aoj;

import java.util.Scanner;

public class ITP1_1_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int s = a * b;
		int l = 2 * (a + b);

		System.out.println(s + " " + l);

		sc.close();

	}

}
