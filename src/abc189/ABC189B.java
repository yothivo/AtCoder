package abc189;

import java.util.Scanner;

public class ABC189B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] v = new int[n];
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}

		int ans = -1;
		int alc = 0;

		for ( int i = 0; i < n; i++) {
			alc += v[i] * p[i];
			if ( alc > x * 100) {
				ans = i + 1;
				break;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
