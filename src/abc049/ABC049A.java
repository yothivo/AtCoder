package abc049;

import java.util.Scanner;

public class ABC049A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String c = sc.next();

		String s = "aeiou";

		if (s.contains(c)) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}

		sc.close();

	}

}
