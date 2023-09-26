package design_pattern.decorator;

// 구체적인 장식자(데코레이터) 클래스
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", 설탕";
    }

    @Override
    public double getCost() {
        return super.getCost() + 300;
    }
}
