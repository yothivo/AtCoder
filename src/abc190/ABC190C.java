package abc190;

import java.util.Scanner;

public class ABC190C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] terms = new int[m][2];

		for (int i = 0; i < m; i++) {
			terms[i][0] = sc.nextInt();
			terms[i][1] = sc.nextInt();
		}

		int k = sc.nextInt();
		int[][] choice = new int[k][2];

		for (int i = 0; i < k; i++) {
			choice[i][0] = sc.nextInt();
			choice[i][1] = sc.nextInt();
		}

		int ans = 0;
		for (int bit = 0; bit < 1 << k; bit++) {
			int[] ball = new int[n];
			for (int i = 0; i < k; i++) {
				if ((bit & 1 << i) == 0) {
					ball[choice[i][0]-1] = 1;
				} else {
					ball[choice[i][1]-1] = 1;
				}
			}
			int cnt = 0;
			for (int[] term: terms) {
				if (ball[term[0]-1] == 1 && ball[term[1]-1] == 1) {
					cnt++;
				}
			}
			if (ans < cnt) {
				ans = cnt;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
