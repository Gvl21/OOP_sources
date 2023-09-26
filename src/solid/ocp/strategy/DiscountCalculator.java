package solid.ocp.strategy;


// 할인을 계산하는 클래스
public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(Order order) {
        // 할인 계산 로직
        return discountStrategy.applyDiscount(order);
    }
}
