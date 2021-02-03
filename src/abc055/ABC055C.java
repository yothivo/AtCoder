package abc055;

import java.util.Scanner;

public class ABC055C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		long ans = 0;

		if (m <= 2 * n) {
			ans = m / 2;
		} else {
			ans = (m - 2 * n) / 4;
			ans = ans + n;
		}

		System.out.println(ans);

	}

}
