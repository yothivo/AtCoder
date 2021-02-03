package abc053;

import java.util.Scanner;

public class ABC053B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int ans = 0;

		ans = s.lastIndexOf('Z') - s.indexOf('A') + 1;

		System.out.println(ans);

		sc.close();

	}

}
