package abc043;

import java.util.Scanner;

public class ABC043C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		int t_ans = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			t_ans += a[i];
		}

		t_ans = Math.round((float)t_ans / n);

		int ans = 0;

		for (int i = 0; i < n; i++) {
			ans += (t_ans - a[i]) * (t_ans - a[i]);
		}

		System.out.println(ans);

		sc.close();

	}

}
