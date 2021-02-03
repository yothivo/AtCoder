package abc057;

import java.util.Scanner;

public class ABC057A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int ans = (a + b) % 24;

		System.out.println(ans);

	}

}
