package abc044;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABC044B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String w = sc.next();

		Map<Character, Integer> mp = new HashMap<>();

		for (int i = 0; i < w.length(); i++) {
			if (mp.containsKey(w.charAt(i))) {
				mp.replace(w.charAt(i), mp.get(w.charAt(i)) + 1);
			} else {
				mp.put(w.charAt(i), 1);
			}
		}

		boolean flag = true;

		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}
