package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_자가진단2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}