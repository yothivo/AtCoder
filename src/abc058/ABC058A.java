package abc058;

import java.util.Scanner;

public class ABC058A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if(b - a == c - b) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
