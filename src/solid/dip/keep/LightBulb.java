package solid.dip.keep;

// 구체 클래스에서 추상화
public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("전등을 켭니다.");    
    }

    public void turnOff() {
        System.out.println("전등을 끕니다.");    
    }
    
}
