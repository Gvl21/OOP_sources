package encapsulation.method;

public class Test {
    public static void main(String[] args) {
        InterProcess process = new Process();

        // 개발자의 의도
//        process.init();
//        process.process();
//        process.release();

        // 사용자가 순서를 잘못 실행할 경우
//        process.release();
//        process.init();

        process.work();

    }
}
