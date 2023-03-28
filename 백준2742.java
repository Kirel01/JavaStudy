package kr.co.ezenac.백준0328;

import java.util.Scanner;

public class 백준2742 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i < n + i; i--) {
			System.out.println(i);
			if (i == 1) {
				break;
			}
		}

		sc.close();
	}
}
