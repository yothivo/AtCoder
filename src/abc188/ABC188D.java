package abc188;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ABC188D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cost = sc.nextInt();

		int a, b, c;

		Map<Integer, Long> events = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			if (events.containsKey(a - 1)) {
				events.replace(a - 1, events.get(a - 1) + c);
			} else {
				events.put(a - 1, (long) c);
			}
			if (events.containsKey(b)) {
				events.replace(b, events.get(b) - c);
			} else {
				events.put(b, (long) -c);
			}
		}

		long s = 0;
		long total = 0;
		int pre = 0;

		for (Map.Entry<Integer, Long> event : events.entrySet()) {
			total += Math.min(cost, s) * (event.getKey() - pre);
			s += event.getValue();
			pre = event.getKey();
		}

		System.out.println(total);

		sc.close();
	}

}
