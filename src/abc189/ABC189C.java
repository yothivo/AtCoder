package abc189;

import java.util.Scanner;

public class ABC189C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int ans = 0;

		for (int l = 0; l < n; l++) {
			int x = a[l];
			for (int r = l; r < n; r++) {
				x = Math.min(x, a[r]);
				ans = Math.max(ans, x * (r - l + 1));
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
