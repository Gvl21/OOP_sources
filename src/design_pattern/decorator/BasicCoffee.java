package design_pattern.decorator;

// 구체적인 컴포넌트 (Concrete Component)
// 컴포넌트를 구현한 실체, 실체를 데코레이터로 감싼다
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "커피";
    }

    @Override
    public double getCost() {
        return 2000;
    }
}
