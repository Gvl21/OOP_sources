package design_pattern.strategy;

public class StrategySword implements Strategy {

    @Override
    public void run() {
        System.out.println("칼을 씁니다. 슥슥슥");
    }
}
