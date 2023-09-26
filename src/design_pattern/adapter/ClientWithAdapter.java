package design_pattern.adapter;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA serviceA = new AdapterServiceA();
        AdapterServiceB serviceB = new AdapterServiceB();

        // 호출 당하는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록
        // 중간에 변환기를 통해서 호출하는 패턴
        serviceA.run();
        serviceB.run();

    }
}
