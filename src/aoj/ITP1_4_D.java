package aoj;

import java.util.Scanner;

public class ITP1_4_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();

		int min = a;
		int max = a;
		long sum = a;

		for (int i = 1; i < n; i++) {
			a = sc.nextInt();

			if (a < min) {
				min = a;
			}
			if (max < a) {
				max = a;
			}
			sum += a;
		}

		System.out.println(min + " " + max + " " + sum);

		sc.close();

	}

}
