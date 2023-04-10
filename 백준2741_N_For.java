package kr.co.ezenac.백준0316;

import java.util.Scanner;

public class N_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i < N + 1; i++)
			System.out.println(i);
		System.out.println(N);

		sc.close();
	}
}
