package abc189;

import java.util.Scanner;

public class ABC189A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String t = str.substring(0, 1);

		t = t + t + t;

		if(str.equals(t)) {
			System.out.println("Won");
		} else {
			System.out.println("Lost");
		}

		sc.close();

	}

}
