package 백준4월3주차.백준0421;

import java.util.Scanner;

public class 백준2609 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        int max = 0;

        for(int i = 1 ; i<=n && i<=k; i++){
            if(n%i==0 && k%i==0){
               max = i;
            }
        }
        int min = (n*k)/max;

        System.out.println(max);
        System.out.println(min);

    }
}
