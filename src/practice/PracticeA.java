package practice;

import java.util.Scanner;

public class PracticeA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String s = sc.next();

		System.out.println((a+b+c) + " " + s);

		sc.close();

	}

}
