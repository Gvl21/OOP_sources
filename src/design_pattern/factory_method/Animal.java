package design_pattern.factory_method;

// 생성자 (Factory) 클래스
public abstract class Animal {
    // 추상 팩토리 메소드
    abstract AnimalToy getToy();
}
