package design_pattern.observer;

// Subject 주체
// 상태 변화를 감시하고 있는 객체
// 상태가 변화하면 Observer(관측자)들에게 알립니다.
public interface WeatherSubject {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}
