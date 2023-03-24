package kr.co.ezenac.백준0324;

import java.util.Scanner;

public class 백준2744_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isUpperCase(c)) {
				System.out.print(String.valueOf(c).toLowerCase());
			} else
				System.out.print(String.valueOf(c).toUpperCase());
		}

		sc.close();
	}
}
