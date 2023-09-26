package design_pattern.adapter;

public class AdapterServiceA {
    // 어댑터 패턴
    ServiceA serviceA = new ServiceA();

    void run() {
        serviceA.runServiceA();
    }
}
