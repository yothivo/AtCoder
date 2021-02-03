package practice;

import java.util.Scanner;

public class ABC081A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			c = c + Integer.parseInt(s.substring(i, i+1));
		}

		System.out.println(c);

		sc.close();
	}

}
