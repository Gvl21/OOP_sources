package design_pattern.strategy;

// 전략을 사용하는 Context
public class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투를 시작합니다.");
        strategy.run();
        System.out.println("전투를 마칩니다.");
    }
}
