package aoj;

import java.util.Scanner;

public class ITP1_6_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i]);
			if (i != 0 ) {
				System.out.print(" ");
			}
		}
		System.out.println();

	}

}
