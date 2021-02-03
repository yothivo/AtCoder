package abc055;

import java.util.Scanner;

public class ABC055B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();

		sc.close();

		long ans = 1;
		long d = 1000000007;

		for (int i = 1; i <= n; i++) {
			ans = ans*i%d;
		}

		System.out.println(ans);

	}

}
