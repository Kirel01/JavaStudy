package 백준4월4주차.백준0426;

import java.util.Scanner;

public class 백준2231 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int result = 0;

        for (int i =0; i<n; i++) {
            int num = i;
            int sum = 0;

            while (num !=0){
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == n ){
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
