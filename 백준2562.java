package kr.co.ezenac.백준3월5주차.백준0330;

import java.util.Scanner;

public class 백준2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}

		System.out.println(max);

		if (arr[0] == max) {
			System.out.println(1);
		} else if (arr[1] == max) {
			System.out.println(2);
		} else if (arr[2] == max) {
			System.out.println(3);
		} else if (arr[3] == max) {
			System.out.println(4);
		} else if (arr[4] == max) {
			System.out.println(5);
		} else if (arr[5] == max) {
			System.out.println(6);
		} else if (arr[6] == max) {
			System.out.println(7);
		} else if (arr[7] == max) {
			System.out.println(8);
		} else {
			System.out.println(9);
		}
		sc.close();
	}

}
