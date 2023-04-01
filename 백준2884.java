package kr.co.ezenac.백준3월5주차.백준0401_2_주말용;

import java.util.Scanner;

public class 백준2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int rh = 0;
		int rm = 0;

		if (h == 0 && m < 45) {
			rh = 23;
			rm = 15 + m;
		} else if (h == 0 && m >= 45 && m <= 59) {
			rh = 0;
			rm = m - 45;
		} else if (h >= 1 && h <= 23 && m < 45) {
			rh = h - 1;
			rm = 15 + m;
		} else if (h >= 1 && h <= 23 && m >= 45 && m <= 59) {
			rh = h;
			rm = m - 45;
		}

		System.out.println(rh + " " + rm);

		sc.close();
	}
}
