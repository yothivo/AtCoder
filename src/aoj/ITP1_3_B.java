package aoj;

import java.util.Scanner;

public class ITP1_3_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 1;

		while(true) {
			int x = sc.nextInt();

			if (x == 0) {
				break;
			}

			System.out.println("Case " + cnt + ": " + x);
			cnt++;
		}

		sc.close();

	}

}
