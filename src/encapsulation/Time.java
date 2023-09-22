package encapsulation;

public class Time {
    // 캡슐로 감싸서 안보이게 하는 정보 은닉 개념
    // 내부를 감싸서 은닉하고, 보호한다.
    //

    // 접근제한자 private, default, protected, public
    private int pri;
    int def;
    protected int prot;
    public int publ;

    // 일반적으로 필드를 private 로 감싼다.
    private int hour;

    // public 메서드로 접근하게 한다.
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        // 유효성 검사 추가
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
    }
}
