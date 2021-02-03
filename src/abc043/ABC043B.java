package abc043;

import java.util.Scanner;

public class ABC043B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.next().split("");

		String ans = "";

		for (String s : str) {
			if (s.equals("B")) {
				if (ans.length() > 0) {
					ans = ans.substring(0, ans.length() - 1);
				}
			} else {
				ans += s;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
