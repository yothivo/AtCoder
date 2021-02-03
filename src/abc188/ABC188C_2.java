package abc188;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// time out
public class ABC188C_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int n2 = 1 << n;

		int[] a = new int[n2];

		for (int i = 0; i < n2; i++) {
			a[i] = sc.nextInt();
		}

		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < n2; i++) {
			mp.put(a[i], i + 1);
		}

		while (a.length > 2) {
			int[] an = new int[n2/2];

			for (int i = 0; i < a.length; i += 2) {
				an[i/2] = Math.max(a[i], a[i + 1]);
			}

			a = an;
		}

		System.out.println(mp.get(Math.min(a[0], a[1])));

		sc.close();

	}

}
