package abstraction.static_;

// 클래스 멤버 : 객체 멤버 = static 멤버 : instance 멤버

public class Mouse {
    // 인스턴스 멤버 = 각각의 객체에 유일한 속성
    // 쥐의 이름이 ? 나이가 ? => 할 수 없음
    // 쥐의 꼬리가 ? 하나!
    String name;
    int age;
    static int  countOfTail;
    // 모든 클래스의 쥐가 공통적으로 가지는 속성
    // 쥐라는 개념에 꼬리는 항상 하나(돌연변이인 경우 제외)
    // static 키워드가 붙은 경우 static 영역에서 존재하고, heap 메모리에서는 존재하지 않는다.

   void sing(){
       // UML 표기법으로는 행위의 로직을 표현할 수 있다.
       System.out.println(name + " 찍찍! 웁니다");
   };

   // 정적 멤버(스태틱 멤버) 에 적당한 속성은 무엇인다?
    // 고양이 클래스의 다리개수
    // 보병 클래스의 특기번호
    // 승용차(세단) 클래스의 바퀴 개수
    // 남자 클래스의 주민 번호 성별코드

    // 다수의 메서드가 동일한 스태틱 클래스에서 공유하는 속성
}
