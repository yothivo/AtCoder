package abc057;

import java.util.Scanner;

public class ABC057B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] sArray = new int[n][2];
		int[][] cArray = new int[m][2];

		for (int i = 0; i < n; i++) {
			sArray[i][0] = sc.nextInt();
			sArray[i][1] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			cArray[i][0] = sc.nextInt();
			cArray[i][1] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			int dMin = Math.abs(sArray[i][0] - cArray[0][0]) + Math.abs(sArray[i][1] - cArray[0][1]);;
			int index = 1;
			for (int j = 1; j < m; j++) {
				int d = Math.abs(sArray[i][0] - cArray[j][0]) + Math.abs(sArray[i][1] - cArray[j][1]);
				if (d < dMin) {
					dMin = d;
					index = j + 1;
				}
			}
			System.out.println(index);
		}

	}

}
