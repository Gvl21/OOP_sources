package solid.ocp.strategy;

// 구체적인 전략
// 기본 할인 전략 : 10%
public class DefaultDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        return order.getTotalAmount() * 0.1;
    }
}
