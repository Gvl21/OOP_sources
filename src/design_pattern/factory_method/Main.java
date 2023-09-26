package design_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        // 팩토리 메서드를 보유한 객체들을 생성
        Animal dog = new Dog();
        Animal cat = new Cat();

        // 팩토리 메서드 => 객체(제품)를 반환
        AnimalToy ball = dog.getToy();
        AnimalToy catTower = cat.getToy();

        // 팩토리 메서드가 리턴한 (생성한) 객체들을 사용
        ball.show();
        catTower.show();

    }
}
