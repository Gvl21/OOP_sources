package encapsulation.method;

public class Process implements InterProcess {
    // 순서 1번
    private void init() {}

    // 순서 2번
    private void process() {}

    // 순서 3번
    private void release() {}

    public void work() {
        init();
        process();
        release();
    }
}
