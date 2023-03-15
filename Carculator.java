package kr.co.ezenac.백준0315;

import java.util.Scanner;

public class Carculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A, B;
		
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		scan.close();
	}
}
