package 백준4월1주차.백준0408_09주말용;

import java.util.Scanner;

public class 백준1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];
        double m = arr[0];
        double sum = 0;
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]/m*100;
        }
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum/arr.length);
        sc.close();
    }
}
