package abc056;

import java.util.Scanner;

public class ABC056B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int ans = Math.abs(a - b) - w;
		ans = (ans >= 0) ? ans : 0;

		System.out.println(ans);

	}

}
