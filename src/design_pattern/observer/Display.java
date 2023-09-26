package design_pattern.observer;

// 구체적인 옵저버 클래스
public class Display implements WeatherObserver {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " | 현재 날씨 : " + weather);
    }
}
