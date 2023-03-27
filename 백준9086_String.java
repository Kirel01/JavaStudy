package kr.co.ezenac.백준0327;

import java.util.Scanner;

public class 백준9086_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String a = sc.next();
			int l = a.length();
			String fir_char = String.valueOf(a.charAt(0));
			String last_char = String.valueOf(a.charAt(l - 1));
			System.out.println(fir_char + last_char);
		}
		
		sc.close();

	}
}
