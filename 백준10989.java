package 백준4월4주차.백준0424;

import java.io.*;
import java.util.Arrays;

public class 백준10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = bf.readLine();

        int arr[] = new int[Integer.parseInt(n)];
        int nn = Integer.parseInt(n);

        for(int i =0; i<nn; i++){
            arr[i]= Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < nn; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
