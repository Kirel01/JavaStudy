package kr.co.ezenac.백준0323;

import java.util.Scanner;

public class 백준5597Array3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[31];

		for (int i = 1; i < 29; i++) {
			arr[sc.nextInt()]++;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
