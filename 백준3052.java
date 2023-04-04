package 백준4월1주차.백준0404;

import java.util.Scanner;

public class 백준3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 1;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        if (arr[0] != arr[1]) {
            count++;
        }
        if (arr[0] != arr[2] && arr[1] != arr[2]) {
            count++;
        }
        if (arr[0] != arr[3] && arr[1] != arr[3] && arr[2] != arr[3]) {
            count++;
        }
        if (arr[0] != arr[4] && arr[1] != arr[4] && arr[2] != arr[4] && arr[3] != arr[4]) {
            count++;
        }
        if (arr[0] != arr[5] && arr[1] != arr[5] && arr[2] != arr[5] && arr[3] != arr[5] && arr[4] != arr[5]) {
            count++;
        }
        if (arr[0] != arr[6] && arr[1] != arr[6] && arr[2] != arr[6] && arr[3] != arr[6] && arr[4] != arr[6] && arr[5] != arr[6]) {
            count++;
        }
        if (arr[0] != arr[7] && arr[1] != arr[7] && arr[2] != arr[7] && arr[3] != arr[7] && arr[4] != arr[7] && arr[5] != arr[7] && arr[6] != arr[7]) {
            count++;
        }
        if (arr[0] != arr[8] && arr[1] != arr[8] && arr[2] != arr[8] && arr[3] != arr[8] && arr[4] != arr[8] && arr[5] != arr[8] && arr[6] != arr[8] && arr[7] != arr[8]) {
            count++;
        }
        if (arr[0] != arr[9] && arr[1] != arr[9] && arr[2] != arr[9] && arr[3] != arr[9] && arr[4] != arr[9] && arr[5] != arr[9] && arr[6] != arr[9] && arr[7] != arr[9] && arr[8] != arr[9]) {
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
