package kr.co.ezenac.백준0315;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		if (a < b) {
			System.out.println("<");
		} else if (a > b) {
			System.out.println(">");
		} else
			System.out.println("==");

		sc.close();

	}
}
