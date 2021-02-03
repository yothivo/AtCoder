package abc042;

import java.util.Arrays;
import java.util.Scanner;

public class ABC042B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();

		String[] s_list = new String[n];

		for (int i = 0; i < n; i++) {
			s_list[i] = sc.next();
		}

		Arrays.sort(s_list);

		String ans = "";

		for (int i = 0; i < n; i++) {
			ans += s_list[i];
		}

		System.out.println(ans);

		sc.close();

	}

}
