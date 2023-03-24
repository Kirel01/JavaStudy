package kr.co.ezenac.백준0325_6_주말용;

import java.util.Scanner;

public class 백준15964_Function {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		System.out.println((a + b) * (a - b));

		sc.close();
	}
}
