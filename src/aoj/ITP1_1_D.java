package aoj;

import java.util.Scanner;

public class ITP1_1_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		int h = s / 3600;
		s %= 3600;
		int m = s / 60;
		s %= 60;

		System.out.println(h + ":" + m + ":" + s);

		sc.close();

	}

}
