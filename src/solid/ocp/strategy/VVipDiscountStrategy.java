package solid.ocp.strategy;

// VVIP 할인 전략 : 30%
public class VVipDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        return order.getTotalAmount() * 0.3;
    }
}
