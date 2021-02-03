package abc188;

import java.util.Scanner;

public class ABC188A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x < y) {
			if ((x + 3) > y) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if ((y + 3) > x) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		sc.close();

	}

}
