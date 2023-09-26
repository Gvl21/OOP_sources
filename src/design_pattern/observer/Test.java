package design_pattern.observer;

public class Test {
    public static void main(String[] args) {
        // 주체 클래스, 옵저버 클래스 생성
        WeatherData weatherData = new WeatherData();
        Display display1 = new Display("1번 화면");
        Display display2 = new Display("2번 화면");

        // 등록
        weatherData.registerObserver(display1);
        weatherData.registerObserver(display2);

        // 상태가 변경될 시 모두(옵저버)에게 알림
        weatherData.setWeather("맑음");
        weatherData.setWeather("비옴");

        // 등록 해제
        weatherData.removeObserver(display1);

        // 해제가 된 옵저버에게는 더 이상 상태 알림이 가지 않음
        weatherData.setWeather("눈옴");
        
    }
}
