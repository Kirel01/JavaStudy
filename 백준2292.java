package 백준4월3주차.백준0419;

import java.util.Scanner;

public class 백준2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int count = 1;
        int range = 2;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) {
                range = range + (count * 6);
                count++;
            }
            System.out.println(count);
        }


    }
}
