package design_pattern.adapter;

public class AdapterServiceB {
    // 어댑터 패턴
    ServiceB serviceB = new ServiceB();

    void run() {
        serviceB.runServiceB();
    }
}
