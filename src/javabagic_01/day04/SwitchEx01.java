package javabagic_01.day04;

public class SwitchEx01 {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 6) + 1;

        switch(num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("스위치 문입니다"); // 원래 범위 외의 숫자는 default 로!
        }
    }
}
