package kr.co.ezenac.백준0324;

import java.util.Scanner;

public class 백준2754_Calc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		if (str.equals("A+")) {
			System.out.println(4.3);
		}
		if (str.equals("A0")) {
			System.out.println(4.0);
		}
		if (str.equals("A-")) {
			System.out.println(3.7);
		}
		if (str.equals("B+")) {
			System.out.println(3.3);
		}
		if (str.equals("B0")) {
			System.out.println(3.0);
		}
		if (str.equals("B-")) {
			System.out.println(2.7);
		}
		if (str.equals("C+")) {
			System.out.println(2.3);
		}
		if (str.equals("C0")) {
			System.out.println(2.0);
		}
		if (str.equals("C-")) {
			System.out.println(1.7);
		}
		if (str.equals("D+")) {
			System.out.println(1.3);
		}
		if (str.equals("D0")) {
			System.out.println(1.0);
		}
		if (str.equals("D-")) {
			System.out.println(0.7);
		}
		if (str.equals("F")) {
			System.out.println(0.0);
		}

		sc.close();
	}
}
