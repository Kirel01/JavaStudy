package kr.co.ezenac.백준0324;

import java.util.Scanner;

public class 백준27866_Str_Char {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int i = sc.nextInt();

		System.out.println(s.charAt(i - 1));

		sc.close();
	}
}
