package design_pattern.template_method;

// 게임 캐릭터를 생성하는 추상 클래스
public abstract class GameCharacter {
    // 템플릿 메서드
        // 공통 동작을 가진 알고리점을 정의
        // 구체적인 단계는 서브 클래스에서 구현
    public GameCharacter() {
        selectType();
        customize();
        selectSkill();
        displayInfo();
    }

    // 추상 메서드 : 각각 서브 클래스에서 구현
    // 캐릭터 타입 선택
    abstract void selectType();
    // 캐릭터 꾸미기
    abstract void customize();
    // 기술 선택하기
    abstract void selectSkill();

    // 일반 메서드 : 모든 클래스에서 동일하게 사용
    void displayInfo() {
        System.out.println("캐릭터 생성 완료!");
    }
}
