package solid.ocp;

// 할인을 계산하는 클래스
public class DiscountCalculator {
    public double calculateDiscount(Order order) {
        // 할인 계산 로직
        return order.getTotalAmount() * 0.1;
    }
}
