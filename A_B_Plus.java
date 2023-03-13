package kr.co.ezenac.백준0313;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class A_B_Plus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A, B;
		
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.print(A+B);
		
		scan.close();
	}
}
