package abc055;

import java.util.Scanner;

public class ABC055A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(800 * n - 200 * (n / 15));

		sc.close();

	}

}
