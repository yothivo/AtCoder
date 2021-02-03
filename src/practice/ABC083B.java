package practice;

import java.util.Scanner;

public class ABC083B {

	public static int findSumOfDigits(int n) {
		int sum = 0;

		while(n > 0) {
			sum += (n % 10);
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = 0;

		for (int i = 1; i <= n; i++) {
			int sum = findSumOfDigits(i);

			if (a <= sum && sum <= b) {
				total += i;
			}
		}

		System.out.println(total);

		sc.close();

	}

}
