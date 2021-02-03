package aoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ITP1_6_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<String> cards = new ArrayList<>();
		String[] marks = {"S", "H", "C", "D"};

		for (String mark: marks) {
			for (int j = 1; j <= 13; j++) {
				cards.add(mark + " " + j);
			}
		}

		for (int i = 0; i < n; i++) {
			String mark = sc.next();
			int num = sc.nextInt();

			cards.remove(mark + " " + num);
		}
		sc.close();

		for (String card : cards) {
			System.out.println(card);
		}

	}

}
