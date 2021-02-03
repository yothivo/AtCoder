package aoj;

import java.util.Scanner;

public class ITP1_5_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i = 1;

		while (true) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else {
				while (x != 0) {
					if (x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					x /= 10;
				}
			}

			if (n < ++i ) {
				System.out.println();
				break;
			}
		}

		sc.close();



	}

}
