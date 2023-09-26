package design_pattern.strategy;

public class StrategyGun implements Strategy {

    @Override
    public void run() {
        System.out.println("총을 쏩니다. 탕탕탕");
    }
}
