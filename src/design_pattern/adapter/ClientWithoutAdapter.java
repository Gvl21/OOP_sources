package design_pattern.adapter;

public class ClientWithoutAdapter {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        // 각각의 다른 메서드 명으로 각각 다른 메서드를 호출
        serviceA.runServiceA();
        serviceB.runServiceB();

    }
}
