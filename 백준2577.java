package 백준0403;

import java.util.Scanner;

public class 백준2577 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c;
        int rresult = 0;
        int length = (int) (Math.log10(result) + 1);

        int[] arr = new int[length + 1];
        int n = 0;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        while (result != 0) {
            int divide = result % 10;
            rresult = divide;
            arr[n] = rresult;
            result /= 10;
            n++;
            if (rresult == 0) {
                count0++;
            }
            if (rresult == 1) {
                count1++;
            }
            if (rresult == 2) {
                count2++;
            }
            if (rresult == 3) {
                count3++;
            }
            if (rresult == 4) {
                count4++;
            }
            if (rresult == 5) {
                count5++;
            }
            if (rresult == 6) {
                count6++;
            }
            if (rresult == 7) {
                count7++;
            }
            if (rresult == 8) {
                count8++;
            }
            if (rresult == 9) {
                count9++;
            }
        }

        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);

        sc.close();
    }
}
