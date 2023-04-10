package kr.co.ezenac.백준0322;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (v==arr[i]) {
				sum++;
			}
		}

		System.out.println(sum);

		sc.close();
	}
}
