package kr.co.ezenac.백준3월5주차.백준0331;

import java.util.Scanner;

public class 백준10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);

        sc.close();
    }

}