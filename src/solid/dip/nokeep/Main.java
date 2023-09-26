package solid.dip.nokeep;

public class Main {
    public static void main(String[] args) {
        Switch aSwitch = new Switch(new LightBulb());
        aSwitch.operate();
    }
}
