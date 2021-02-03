package abc047;

import java.util.Scanner;

public class ABC047C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int ans = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c != s.charAt(i + 1)) {
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
