package abc047;

import java.util.Arrays;
import java.util.Scanner;

public class ABC047A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];

		for (int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}

		Arrays.sort(num);

		if(num[0] + num[1] == num[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}
