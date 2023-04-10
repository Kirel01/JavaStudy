package kr.co.ezenac.백준0316;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int fac = 1;

		for (int i = 1; i <= N; i++)
			fac *= i;
		System.out.println(fac);

		sc.close();
	}
}
