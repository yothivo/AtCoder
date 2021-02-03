package abc190;

import java.util.Scanner;

public class ABC190A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a + c <= b) {
			System.out.println("Aoki");
		} else {
			System.out.println("Takahashi");
		}

		sc.close();

	}

}
