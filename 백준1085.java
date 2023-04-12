package 백준4월2주차.백준0412;

import java.util.Scanner;

public class 백준1085 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = 1001;

        int[] arr = new int[4];
        arr[0]=x-0;
        arr[1]=w-x;
        arr[2]=y-0;
        arr[3]=h-y;

        for (int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

        sc.close();
    }
}
