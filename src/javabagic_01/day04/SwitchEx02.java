package javabagic_01.day04;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 사용자에게 A-C 중 한 문자를 받아서 'A' ==> 매우 우수  'B' ==> 우수  C ==> 노력하세요
        char grade = in.next().charAt(0);

        switch(grade) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;
        }
    }
}
