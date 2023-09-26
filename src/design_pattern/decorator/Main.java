package design_pattern.decorator;

public class Main {
    public static void main(String[] args) {
        // 데코레이터(장식자 패턴)에서는 기본 컴포넌트와 장식자가
        // 공통의 인터페이스를 공유, 기존 컴포넌트 코드는 중복 없이 유지
        // + 데코레이터는 다양하게 추가하는 것이 가능
        Coffee coffee = new BasicCoffee();
        System.out.println("주문 : " + coffee.getDescription());
        System.out.println("가격 : " + coffee.getCost());

        // 우유를 추가한 커피
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("주문 : " + milkCoffee.getDescription());
        System.out.println("가격 : " + milkCoffee.getCost());

        // 설탕을 추가한 커피
        Coffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println("주문 : " + sugarCoffee.getDescription());
        System.out.println("가격 : " + sugarCoffee.getCost());

        // 우유와 설탕을 추가한 커피
        Coffee milkSugarCofee = new SugarDecorator(new MilkDecorator(coffee));
        System.out.println("주문 : " + milkSugarCofee.getDescription());
        System.out.println("가격 : " + milkSugarCofee.getCost());

    }
}
