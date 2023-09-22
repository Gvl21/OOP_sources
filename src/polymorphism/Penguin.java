package polymorphism;

public class Penguin extends Animal{
    //  1. 오버로딩
    //  2. 오버라이딩

    // A. 같은 메서드 이름, 같은 인자 목록으로 상위 클래스의 메서드를 재정의
    // B. 같은 메서드 이름, 같은 인자 목록으로 다수의 메서드를 중복정의
    //
    // ride : 올라타다(덮어쓰기), load : 적재하다

    // A = 2, B = 1


    @Override // 오버라이딩 : 같은 메서드 이름, 같은 인자 목록으로 상위 클래스의 메서드를 재정의
    public void showName() {
        System.out.println(name + " : 난 나야");
    }
    // 오버로딩 : 같은 메서드 이름, 같은 인자 목록으로 다수의 메서드를 중복정의
    public void showName(String yourName) {
        System.out.printf("%s야 안녕, 나는 %s야.\n", yourName, name);
    }
}
