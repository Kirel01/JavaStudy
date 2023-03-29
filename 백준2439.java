package kr.co.ezenac.백준3월5주차.백준0329;

import java.util.Scanner;

public class 백준2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 sc.close();
	}
}
