package abc051;

import java.util.Scanner;

public class ABC051B_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();

		int count = 0;

		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= k; y++) {
				int z = s - x - y;
				if (0 <= z && z <= k) {
					count++;
				}
			}
		}

		System.out.println(count);

		sc.close();

	}

}
