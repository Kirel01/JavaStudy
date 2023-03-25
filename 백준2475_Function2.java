package kr.co.ezenac.백준0325_6_주말용;

import java.util.Scanner;

public class 백준2475_Function2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int sum = ((a * a) + (b * b) + (c * c) + (d * d) + (e * e)) % 10;
		System.out.println(sum);

	}
}
