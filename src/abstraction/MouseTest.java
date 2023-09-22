package abstraction;




        // 붕어빵틀(클래스) 붕어빵(객체)
        // 붕어빵틀 붕어빵 = new 붕어빵틀(); ----> ?????
        // 새로운 붕어빵틀을 만들었는데 그 붕어빵틀이 붕어빵이라고? (비유를 조심할 것)

        // 클래스(개념, 종류)와 객체(실체)를 구분하는 간단한 질문
        // 사람, 김연아, 펭귄, 뽀로로
        // 생물의 경우 : 몇살이에요?
        // 무생물의 경우 : 제조년도가 언제에요?
        // 말이되면 객체, 말이안되면 클래스.......

public class MouseTest {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        //   변수     힙에 배치된 인스턴스

        // 미키(객체)라는 이름을 가진 생쥐(클래스)
        // 새로운 쥐가 한마리 있는데 그 쥐는 미키마우스다.

        // 컴퓨터 내부
        //Mouse 객체의 참조변수 미키를 만든다.
        // new Mouse() : Mouse 클래스의 인스턴스를 하나 만들어서 Heap 힙에 배치한다.
        // =(assignment) 힙에 배치한 객체의 주소(포인터)를 참조변수 mickey에 할당한다.

        mickey.name = "미키마우스";
        mickey.age = 85;
        mickey.countOfTail = 0;
        mickey.sing();

        mickey = null;
        // mickey.name (사용불가)
        // 연결이 끊어진 인스턴스 객체는 Garbage Coillector가 치운다.

        // 참조변수와 인스턴스 객체(힙) 연결이 끊어지면
        // 더 이상 참조 변수는 클래스의 속성을 사용할 수 없다.

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 70;
        jerry.countOfTail = 1;
        jerry.sing();

        // 메모리 공간
        // Static(고장적) 영역 (메소드 영역) : 클래스들이 존재
        // Stack : 실행되는 메소드들이 스택 자료구조로 쌓임
        // Heap : 생성되는 객체가 있는 곳



    }
}

//class 붕어빵틀 {
//    int 크기;
//    int 찍어내는개수;
//    String 사용하는금속;

