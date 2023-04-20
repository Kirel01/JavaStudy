package 백준4월3주차.백준0420;

import java.util.Scanner;

public class 백준11050 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        long nn = 1l;

        for (int i = 1; i <= n; i++) {
            nn *= i;
        }

        long kk = 1l;

        for (int i = 1; i <= k; i++) {
            kk *= i;
        }

        long nk = 1l;

        for (int i = 1; i <= n - k; i++) {
            nk *= i;
        }

        long result = nn / (kk * nk);

        System.out.println(result);

    }
}
