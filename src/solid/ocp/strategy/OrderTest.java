package solid.ocp.strategy;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1, 100);

        // 기본 할인
        DiscountStrategy defaultDiscountStrategy = new DefaultDiscountStrategy();
        DiscountCalculator discountCalculator = new DiscountCalculator(defaultDiscountStrategy);
        double discount = discountCalculator.calculateDiscount(order);
        System.out.println("할인 금액 " + discount);

        // 기존의 코드 변경 없이 새로운 기능을 추가
        // VIP 할인
        DiscountCalculator vipCalculator = new DiscountCalculator(new VipDiscountStrategy());
        double vipDC = vipCalculator.calculateDiscount(order);
        System.out.println("vip 할인 = " + vipDC);

        // 새로운 전략이 추가되어도 기존 코드는 전혀 수정할 필요가 없다. 확장 가능
        DiscountCalculator vvipCal = new DiscountCalculator(new VVipDiscountStrategy());
        double vvip = vvipCal.calculateDiscount(order);
        System.out.println("vvip할인 = " + vvip);
    }
}
