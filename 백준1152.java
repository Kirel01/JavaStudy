package 백준4월1주차.백준0408_09주말용;

import java.util.Scanner;

public class 백준1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        int empty = 1;
        int emp1 = 1;
        int emp2 = 2;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                empty++;
            }
        }

        if (s.charAt(0) == ' ' && s.charAt(s.length() - 1) != ' ') {
            System.out.println(empty - emp1);
        } else if (s.charAt(0) != ' ' && s.charAt(s.length() - 1) == ' ') {
            System.out.println(empty - emp1);
        } else if (s.charAt(0) == ' ' && s.charAt(s.length() - 1) == ' ') {
            System.out.println(empty - emp2);
        } else {
            System.out.println(empty);
        }


    }
}
