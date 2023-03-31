package kr.co.ezenac.백준3월5주차.백준0401_2_주말용;

import java.util.Scanner;

public class 백준2920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		String music = "";

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				music = "ascending";
			} else if (arr[i] == arr[i + 1] + 1) {
				music = "descending";
			} else {
				music = "mixed";
			break;
			}
		}
		System.out.println(music);
	}
}
