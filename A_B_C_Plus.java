package kr.co.ezenac.백준0315;

import java.util.Scanner;

public class A_B_C_Plus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long A, B, C;
		
		A = scan.nextLong();
		B = scan.nextLong();
		C = scan.nextLong();
		System.out.println(A+B+C);
		
		scan.close();
	}
}
