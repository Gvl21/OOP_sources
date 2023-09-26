package solid.ocp;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1, 100);
        DiscountCalculator discountCalculator = new DiscountCalculator();

        double discount = discountCalculator.calculateDiscount(order);
        double finalAmount = order.getTotalAmount() - discount;

        // 만약 VIP 클래스가 새로 생겨서 20% 할인을 하게 될 경우
        // 기존 코드를 수정해야 되는 상황이 발생한다. OCP 위반
        System.out.println("할인금액 discount = " + discount);
        System.out.println("최종금액 finalAmount = " + finalAmount);
    }
}
