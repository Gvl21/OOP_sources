package solid.dip.keep;

public class Main {
    public static void main(String[] args) {
        // DIP 준수
        // 유지보수와 확장에 용이하게 되고, 재사용성이 올라간다.
        Switchable device = new LightBulb();
        Switch aSwitch = new Switch(device);
        aSwitch.operate();
    }
}
