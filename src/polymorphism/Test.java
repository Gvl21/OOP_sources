package polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal mickey = new Animal();
        mickey.name = "미키";
        mickey.showName();

        // 상위 클래스의 기본 메소드가 실행


        Penguin pororo = new Penguin();
        pororo.name = "뽀로로";
        // 오버라이딩된 메소드를 실행한다.
        pororo.showName();
        // 오버로딩된 메소드를 실행한다.
        pororo.showName("루피");

        // Type이 상위클래스 Animal인 경우
        Animal pengsoo = new Penguin();
        pengsoo.name = "펭수";

        // 하위 클래스의 오버라이딩은 적용
        pengsoo.showName();
        // 하위클래스의 오버로딩은 적용되지 않는다.
//        pengsoo.showName(pororo.name);



    }
}
