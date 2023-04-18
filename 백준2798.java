package 백준4월3주차.백준0418;

import java.util.Scanner;

public class 백준2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int result = search(arr, n, m);
        System.out.println(result);
    }

    static int search(int[] arr, int n, int m) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == m) {
                        return sum;
                    }
                    if (result < sum && sum < m) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
