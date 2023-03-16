package kr.co.ezenac.백준0316;

import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}

		sc.close();
	}
}
