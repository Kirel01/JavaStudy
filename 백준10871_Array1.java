package kr.co.ezenac.백준0321;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i <= n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
	}
}
