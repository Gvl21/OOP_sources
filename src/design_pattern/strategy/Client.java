package design_pattern.strategy;

// 전략을 생성해서 Context에게 주입해줄 클라이언트
// 무기를 조달해서 군인에게 지급해줄 제3자
public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 전략을 주입한다. => 총을 전달해서 전투수행
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        // 전략을 주입한다. => 칼을 전달해서 전투수행
        strategy = new StrategyBow();
        rambo.runContext(strategy);

        // 클라이언트가 전략을 생성해서,
        // 전략을 실행할 컨텍스트에게
        // 전략을 주입하는 패턴
        // OCP, DIP가 적용
    }
}
