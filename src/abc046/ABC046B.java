package abc046;

import java.util.Scanner;

public class ABC046B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long ans = k;
		for ( int i = 2; i <= n; i++) {
			ans *= (k - 1);
		}

		System.out.println(ans);

		sc.close();

	}

}
