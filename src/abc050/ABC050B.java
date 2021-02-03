package abc050;

import java.util.Scanner;

public class ABC050B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] t = new int[n];

		int sum = 0;

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			sum += t[i];
		}

		int m = sc.nextInt();

		int[] p = new int[m];
		int[] x = new int[m];

		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}

		int ans = sum;

		for (int i = 0; i < m; i++) {
			ans = sum + x[i] - t[p[i] - 1];
			System.out.println(ans);
		}

		sc.close();

	}

}
