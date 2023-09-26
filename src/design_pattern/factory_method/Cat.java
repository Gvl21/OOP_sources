package design_pattern.factory_method;

// 구체적(Concrete) 생성자(Factory) 클래스
public class Cat extends Animal {
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
