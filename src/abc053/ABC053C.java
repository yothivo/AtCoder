package abc053;

import java.util.Scanner;

public class ABC053C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		long ans = 0;

		ans = x / 11 * 2;
		if (x % 11 != 0) {
			ans += (x % 11 <= 6 ? 1 : 2);
		}

		System.out.println(ans);

		sc.close();

	}

}
