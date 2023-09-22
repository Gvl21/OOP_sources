package encapsulation;

public class Test {
    public static void main(String[] args) {
        Time time = new Time();

        // 필드가 private으로 보호되어있어 접근 불가
//        time.hour = 12;

        // 유효하지 않은 접근
        time.setHour(25); // 0
        System.out.println(time.getHour());

        // 유효한 접근
        time.setHour(12);
        System.out.println(time.getHour());

    }
}
