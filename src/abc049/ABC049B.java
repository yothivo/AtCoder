package abc049;

import java.util.Scanner;

public class ABC049B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		String[][] c = new String[h][w];

		for (int i = 0; i < h; i++) {
			c[i] = sc.next().split("");
		}

		for (int i = 0; i < 2 * h; i++) {
			int x = (int) (i / 2);
			for (int j = 0; j < w; j++) {
				System.out.print(c[x][j]);
			}
			System.out.println();
		}

		sc.close();

	}

}
