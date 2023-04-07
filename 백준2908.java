package 백준4월1주차.백준0407;

import java.util.Scanner;

public class 백준2908 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ra = 0;
        int rb = 0;

        while (a != 0) {
            int divide = a % 10;
            ra = ra * 10 + divide;
            a /= 10;
        }

        while (b != 0) {
            int divide2 = b % 10;
            rb = rb * 10 + divide2;
            b /= 10;
        }

        if(ra>rb){
            System.out.println(ra);
        }else{
            System.out.println(rb);
        }

        sc.close();
    }
}
