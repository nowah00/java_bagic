package java_advanced.day15.generic;

public class FruitBoxMain {

    public static void main(String[] args) {
        //제너릭 타입 매개변수에 정수 타입을 할당
        FruitBox<Integer> intBox = new FruitBox<>();
        //제너릭 타입 매개변수에 실수 타입을 할당
        FruitBox<Double> doubleBox = new FruitBox<>();
        //제너릭 타입 매개변수에 문자열 타입을 할당
        FruitBox<String> stringBox = new FruitBox<>();
        //제너릭 타입 매개변수에 사과 타입을 할당
        FruitBox<Apple> appleBox = new FruitBox<>();

        Apple apple = new Apple();
        appleBox.add(apple);
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }


    }
}
