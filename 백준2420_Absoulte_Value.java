package kr.co.ezenac.백준0316;

import java.util.Scanner;

public class Absoulte_Value {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long M = sc.nextLong();

		System.out.println(Math.abs(N-M));

		sc.close();
	}
}
