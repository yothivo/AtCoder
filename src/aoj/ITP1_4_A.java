package aoj;

import java.util.Scanner;

public class ITP1_4_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long d = a / b;
		long r = a % b;
		double f = (double) a / b;

		System.out.printf("%d %d %f", d, r, f);

		sc.close();

	}

}
