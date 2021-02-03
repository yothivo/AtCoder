package abc045;

import java.util.Scanner;

public class ABC045B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = new String[3];
		int[] at = new int[3];

		for (int i = 0; i < 3; i++) {
			str[i] = sc.next();
			at[i] = 0;
		}

		int turn = 0;
		int pre_turn;

		for (int i = 0; i < 300; i++) {
			if (at[turn] == (str[turn].length())) {
				break;
			}
			pre_turn = turn;
			turn = str[turn].charAt(at[turn]) -  'a';
			at[pre_turn]++;
		}

		String ans = "";

		if (turn == 0) {
			ans = "A";
		}
		if (turn == 1) {
			ans = "B";
		}
		if (turn == 2) {
			ans = "C";
		}

		System.out.println(ans);

		sc.close();

	}

}
