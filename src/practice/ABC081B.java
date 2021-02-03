package practice;

import java.util.Scanner;

public class ABC081B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int c = 0;

		while (true) {

			boolean flag = true;

			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 1) {
					flag = false;
				}
			}

			if (flag == false) {
				break;
			}

			for (int i = 0; i < n; i++) {
				a[i] /= 2;
			}

			c++;
		}

		System.out.println(c);

		sc.close();
	}

}
