package 백준4월1주차.백준0405;

import java.util.Scanner;

public class 백준2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();

        }

        sc.close();
    }
}
