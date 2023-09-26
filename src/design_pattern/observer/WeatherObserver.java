package design_pattern.observer;

// Observer(관측자)
// 주체의 상태 변화를 관찰하고,
// 상태 변화에 대응하는 객체
// 주체에게 등록이 되어
// 상태 변화가 있을 때 알림을 받고, 적절한 동작 수행
public interface WeatherObserver {
    void update(String weather);
}
