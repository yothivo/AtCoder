package abc047;

import java.util.Scanner;

public class ABC047B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();

		int x1 = 0;
		int x2 = w;
		int y1 = 0;
		int y2 = h;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			switch (a) {
			case 1:
				x1 = Math.max(x1, x);
				break;

			case 2:
				x2 = Math.min(x2, x);
				break;

			case 3:
				y1 = Math.max(y1, y);
				break;

			case 4:
				y2 = Math.min(y2, y);
				break;
			}

		}

		int ans = 0;

		if (x1 < x2 && y1 < y2) {
			ans = (x2 - x1) * (y2 - y1);
		}

		System.out.println(ans);

		sc.close();

	}

}
