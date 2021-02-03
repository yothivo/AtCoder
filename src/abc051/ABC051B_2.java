package abc051;

import java.util.Scanner;

public class ABC051B_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();

		int count = 0;

		for (int x = 0; x <= k; x++) {
			int min = Math.max(0, s - k - x);
			int max = Math.min(k, s - x);

			count += Math.max(0, max - min + 1);
		}

		System.out.println(count);

		sc.close();
	}

}
