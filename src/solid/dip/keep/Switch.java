package solid.dip.keep;

// 고수준 모듈
public class Switch {
    // 구체화인 전구 클래스가 아닌 추상화에 의존하고 있다.
    // DIP 준수
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
