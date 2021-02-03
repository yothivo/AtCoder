package aoj;

import java.util.Scanner;

public class ITP1_3_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int cnt = 0;

		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();

	}

}
