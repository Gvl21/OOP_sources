package design_pattern.strategy;

public class StrategyBow implements Strategy {

    @Override
    public void run() {
        System.out.println("활을 쏩니다. 슝슝슝");
    }
}
