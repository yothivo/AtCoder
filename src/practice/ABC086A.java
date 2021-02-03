package practice;

import java.util.Scanner;

public class ABC086A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int p = a * b;

		if((p % 2) == 1) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}

		sc.close();

	}

}
