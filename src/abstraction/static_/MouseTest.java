package abstraction.static_;

public class MouseTest {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mighty = new Mouse();
        System.out.println(mighty.countOfTail);

        Mouse.countOfTail=1;    // 스태틱(클래스) 멤버는 클래스로 접근 가능
//        Mouse.name = "쥐";     인스턴스 멤버는 클래스로 접근 불가
        System.out.println(mighty.countOfTail);
    }
}
