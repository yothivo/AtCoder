package abc044;

import java.util.Scanner;

public class ABC044A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int ans = 0;

		if (n <= k) {
			ans = x * n;
		} else {
			ans = x * k + y * (n - k);
		}

		System.out.println(ans);

		sc.close();

	}

}
