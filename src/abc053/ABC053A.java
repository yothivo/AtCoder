package abc053;

import java.util.Scanner;

public class ABC053A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x < 1200) {
			System.out.println("ABC");
		} else {
			System.out.println("ARC");
		}

		sc.close();

	}

}
