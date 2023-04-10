package kr.co.ezenac.백준0315;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year;

		year = sc.nextInt();

		if (year >= 1 && year <= 4000)
			if (year % 4 == 0 && year % 400 == 0) {
				System.out.println("1");
			} else if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("1");
			} else
				System.out.println("0");

		sc.close();
	}
}
