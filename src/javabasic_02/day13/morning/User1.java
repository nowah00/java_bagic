package javabasic_02.day13.morning;

public class User1 {

    public static void main(String[] args) {
        Service service = new ServiceImpl();

        //디폴트 메소드 호출
        service.defaultMethod1();
        service.defaultMethod2();

        //정적 메소드 호출
        Service.staticMethod1();
        Service.staticMethod2();
    }
}
