package design_pattern.singleton;

// 단 하나의 인스턴스만 가지도록 보장하는 패턴
//  1. 어플리케이션에서 전역적으로 접근 가능한 객체가 필요할 때
//  2. 리소스 낭비를 최소화하고자 할때 (객체를 단 한번만 생성)
public class Singleton {
    // private 생성자 : 외부에서 객체 생성 불가
    // static 인스턴스 : 유일한 정적 인스턴스에 접근 가능한 정적 메서드 제공

    // 유일한 인스턴스를 저장
    private static Singleton instance;

    // 외부 생성을 막음
    private Singleton() {
    }

    // 인스턴스를 얻는 메서드
    public static Singleton getInstance() {
        if (instance == null) {
            new Singleton();
        }
        return instance;
    }
}
