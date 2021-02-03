package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ABC088B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Integer[] a = new Integer[n];

		Arrays.sort(a, Collections.reverseOrder());

		int res = 0;

		for (int i = 0; i < n; i++) {
			if ((i % 2) == 1) {
				res += a[i];
			} else {
				res -= a[i];
			}
		}

		System.out.println(res);

		sc.close();
	}

}
