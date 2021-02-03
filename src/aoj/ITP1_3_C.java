package aoj;

import java.util.Scanner;

public class ITP1_3_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 0 && y == 0) {
				break;
			}
			if (y < x) {
				int t = x;
				x = y;
				y = t;
			}
			System.out.println(x + " " + y);
		}

		sc.close();

	}

}
