package solid.lsp;

public class LSP {
    /**
     *  리스코프 치환 원칙
     *  프로그램의 서브타입은 언제나 기본타입으로 대체될 수 있어야 한다.
     *  
     *  1. 하위 클래스는 상위 클래스를 대체할 수 있어야 한다.
     *  2. 하위 클래스는 상위 클래스 기능을 변경하지 않고, 확장이 가능해야 한다.
     *  3. 포함(Composition) 관계 대신 상속 관계를 사용할 때 주의가 필요하다.
     *  
     */

}

class Bird {
    public void fly() {
        System.out.println("새가 납니다");
    }
}

class 타조 extends Bird {
    // 하위 클래스는 상위 클래스를 대체 가능해야 한다.
    // LSP를 위반
    @Override
    public void fly() {
        System.out.println("타조는 날지 못합니다.");
    }
}