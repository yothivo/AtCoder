package abc050;

import java.util.Scanner;

public class ABC050A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();

		int ans = 0;

		if ( op.equals("+")) {
			ans = a + b;
		} else if (op.equals("-")) {
			ans = a- b;
		}

		System.out.println(ans);

		sc.close();

	}

}
