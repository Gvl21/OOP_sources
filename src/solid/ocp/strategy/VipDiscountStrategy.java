package solid.ocp.strategy;

// VIP 할인 전략 : 20%
public class VipDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        return order.getTotalAmount() * 0.2;
    }
}
