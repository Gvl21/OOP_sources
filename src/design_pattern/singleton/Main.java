package design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        // 외부에서 객체 생성 불가
        // new Singleton();

        // 정적 메소드를 통해서만 생성 가능
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        // 모든 인스턴스는 같은 주소를 참조
        System.out.println(instance == instance2);
        System.out.println(instance == instance3);

    }
}
