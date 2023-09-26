package solid.srp.bad;

class Order {
    private int orderId;
    private String orderDetail;
}
// 주문 처리 클래스 : 하나의 클래스가 여러 개의 책임을 가지고 있다.
class OrderProcessor {
    // 주문 생성
    public Order createOrder(String orderDetail) {
        // 주문 생성 로직....
        return new Order();
    }
    // 주문을 데이터베이스에 저장
    public void saveOrder(Order order) {
        // ...
    }
    // 주문 처리
    public void processOrder(Order order) {
        // ...
    }
}

class OrderTest {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        // 주문 생성
        Order order = orderProcessor.createOrder("상세 주문 내용");

        // 주문 저장
        orderProcessor.saveOrder(order);

        // 주문 처리
        orderProcessor.processOrder(order);
    }
}
