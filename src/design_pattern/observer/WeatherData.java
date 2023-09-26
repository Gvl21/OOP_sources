package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

// 구체적 주체(subject) 클래스
public class WeatherData implements WeatherSubject {
    // 옵저버의 목록
    private List<WeatherObserver> observerList = new ArrayList<>();
    // 상태
    private String weather;

    @Override
    public void registerObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observerList) {
            observer.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        // 상태(날씨)가 변경되었을 때 모든 옵저버에게 알림.
        notifyObservers();
    }
}
