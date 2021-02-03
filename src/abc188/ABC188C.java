package abc188;

import java.util.Scanner;

public class ABC188C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = (int) Math.pow(2, n);

		int[] a = new int[count];

		for (int i = 0; i < count; i++) {
			a[i] = sc.nextInt();
		}

		int max_x = 0;
		int max_y = 0;
		int index_x = 0;
		int index_y = 0;

		for (int i = 0; i < (count / 2); i++) {
			if (a[i] > max_x) {
				max_x = a[i];
				index_x = i;
			}
			if (a[count/2 + i] > max_y) {
				max_y = a[count/2 + i];
				index_y = count/2 + i;
			}
		}

		if (max_x < max_y) {
			System.out.println(index_x + 1);
		} else {
			System.out.println(index_y + 1);
		}

		sc.close();
	}

}
