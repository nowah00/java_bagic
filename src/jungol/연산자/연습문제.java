package jungol.연산자;

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// 연습문제1
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int r1, r2, r3, r4;
//        float r5;
//        r1 = a + b;
//        r2 = a - b;
//        r3 = a * b;
//        r4 = a / b;
//        r5 = a % b;
//        System.out.printf("%d + %d = %d\n", a, b, r1);
//        System.out.printf("%d - %d = %d\n", a, b, r2);
//        System.out.printf("%d * %d = %d\n", a, b, r3);
//        System.out.printf("%d / %d = %d\n", a, b, r4);
//        System.out.printf("%d %% %d = %.0f", a, b, r5);

// 연습문제2-1, 2-2
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = in.nextInt();
//        int e = in.nextInt();
//        int r1, r2, r3, r4;
//        float r5;
//
//        r1 = a + 3;
//        r2 = b - 3;
//        r3 = c * 3;
//        r4 = d / 3;
//        r5 = e % 3;
//
//        System.out.printf("%d ", r1);
//        System.out.printf("%d ", r2);
//        System.out.printf("%d ", r3);
//        System.out.printf("%d ", r4);
//        System.out.printf("%.0f", r5);

// 연습문제3(아직이야)
        int a = 10;
        int b = 10;

        int aa = a++;
        int bb = ++b;

        int aaa = a--;
        int bbb = --b;

        System.out.printf("최초값 a = %d, b = %d\n\n", a, b);
        System.out.printf("a++ = %d, ++b = %d\n 실행후 a = %d, b = %d\n\n", a, b, aa, bb);
        System.out.printf("a-- = %d, --b = %d\n 실행후 a = %d, b = %d", a, b, aaa, bbb);

    }
}
