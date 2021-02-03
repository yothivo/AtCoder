package abc051;

import java.util.Scanner;

public class ABC051B_3 {

	private static int calc_sum(int a, int z) {
		return (a + z) * (z - a + 1)/2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();

		int ans = 0;

		if (s < k) {
			ans = calc_sum(1, s+1);
		} else if (s <= 2*k) {
			ans = calc_sum(2*k-s+1, k+1) + calc_sum(s-k+1, k);
		} else {
			ans = calc_sum(1, 3*k-s+1);
		}

		System.out.println(ans);

		sc.close();

	}

}
