package design_pattern.decorator;

// 구체적인 장식자(데코레이터) 클래스
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", 우유";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500;
    }
}
