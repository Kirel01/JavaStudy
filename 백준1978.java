package 백준4월2주차.백준0414;

import java.util.Scanner;

public class 백준1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s = 0;

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 2) {
                s++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    s--;
                    break;
                }
            }

            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j != 0) {
                    s++;
                    break;
                }

            }
        }

        System.out.println(s);

        sc.close();
    }
}
