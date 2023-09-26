package solid.ocp.strategy;

public class Order {
    private int orderId;
    private double totalAmount;

    public Order(int orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }
    // 다양한 주문 관련 메서드.

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
