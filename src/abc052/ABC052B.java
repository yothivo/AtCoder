package abc052;

import java.util.Scanner;

public class ABC052B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.nextInt();
		char[] sArray = sc.next().toCharArray();

		int x = 0;
		int ans = 0;

		for (char s: sArray) {
			if (s == 'I') {
				x++;
			}
			if (s == 'D') {
				x--;
			}
			ans = Math.max(x, ans);
		}

		System.out.println(ans);

		sc.close();

	}

}
