package solid.ocp.strategy;

// 전략 패턴 : 디자인 패턴 중 하나 다양한 기능을 동적 교체 가능하게 해주는 패턴, 알고리즘을 선택할 수 있게 해준다.
// 할인 전략 (다양한 알고리즘 등을 나타내는 추상 인터페이스)
public interface DiscountStrategy {
    double applyDiscount(Order order);
}

