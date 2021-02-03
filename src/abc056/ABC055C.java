package abc056;

import java.util.Scanner;

public class ABC055C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		sc.close();

		int i =  (int) Math.ceil((-1 + Math.sqrt(1 + 8 * x))/2);

		System.out.println(i);

	}

}
