package 백준4월2주차.백준0413;

import java.util.Scanner;

public class 백준4153 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i >= 0; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0)
                break;

            if ((a * a) + (b * b) == (c * c)) {
                System.out.println("right");
            } else if ((a * a) + (c * c) == (b * b)) {
                System.out.println("right");
            } else if ((b * b) + (c * c) == (a * a)) {
                System.out.println("right");
            }  else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
