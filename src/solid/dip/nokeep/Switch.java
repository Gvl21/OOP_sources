package solid.dip.nokeep;

// 고수준 모듈
public class Switch {
    // Composition (포함관계 has-a)
    // LightBulb 클래스에 직접적으로 의존하고 있다.
    // DIP 위반
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}
