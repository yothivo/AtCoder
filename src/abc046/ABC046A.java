package abc046;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC046A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 3; i++) {
			set.add(sc.nextInt());
		}

		System.out.println(set.size());

		sc.close();


	}

}
