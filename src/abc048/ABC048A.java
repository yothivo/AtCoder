package abc048;

import java.util.Scanner;

public class ABC048A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.next();
		String s = sc.next();
		sc.next();

		System.out.println("A" + s.substring(0, 1) + "C");

		sc.close();

	}

}
