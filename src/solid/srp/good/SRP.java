package solid.srp.good;

public class SRP {
    /**
     * SRP Single Responsibility Principle
     * 한 클래스는 하나의 책임만 가져야 한다.
     *  -> 클래스는 변경 이유가 하나여야만 한다.
     *  클래스가 너무 많은 책임을 가지면,
     *      코드의 유지보수가 어려워진다.
     *      수정사항이 다른 부분에 영향을 미칠 수 있다.
 *
     *  1. 단일 책임성 : 클래스는 하나의 주요 책임을 가져야 한다.
     *                 클래스의 이름은 기능을 명확히 표현해야 한다.
     *  2. 낮은 의존성 : 다른 클래스와 낮은 결합도를 가지고 의존성 최소화
     *  3. 변경 용이성 : 해당 책임을 변경할 필요가 있을 때만 수정.
     *                  다른 책임을 가진 클래스에 영향 미치지 않음
     *
     *  하나의 책임이라는 것은 모호한 개념
     *      (클 수도 있고, 작을 수도 있음)
     *      (문맥과 상황에 따라 책임의 경계는 다르다.)
     *      => 변경을 했을 때 파급효과가 적으면 SRP 잘 지킨 것.
     *      => 기준은 *변경*
}
*/
// 단일책임원칙을 지키지 않은 경우
}
// 주문 클래스
class Order {
    private int orderId;
    private String orderDetail;
}
// 주문 처리 클래스 : 하나의 클래스가 하나의 책임을 갖게 리팩토링
class OrderCreator {
    public Order createOrder(String orderDetails) {
        // ....
        return new Order();
    }
}

class OrderSaver {
    public void saveOrder(Order order) {
        // 주문을 데이터베이스에 저장
    }
}

class OrderProcessor {
    public void processOrder(Order order) {
        // 주문 처리
    }
}

class OrderTest {
    public static void main(String[] args) {
        OrderCreator orderCreator = new OrderCreator();
        OrderSaver orderSaver = new OrderSaver();
        OrderProcessor orderProcessor = new OrderProcessor();

        // SRP를 준수한 경우
        // 클래스별로 하나의 역할, 하나의 책임만 가지고 있다.
        // 클래스가 하나의 책임을 가지면 유지보수가 더 쉬워진다.
        // 코드가 읽기 더 쉬워진다.
        Order order = orderCreator.createOrder("상세주문");

        orderSaver.saveOrder(order);

        orderProcessor.processOrder(order);
    }
}
