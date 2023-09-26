package design_pattern.template_method;

public class Warrior extends GameCharacter {
    @Override
    void selectType() {
        System.out.println("전사 타입을 선택합니다.");
    }

    @Override
    void customize() {
        System.out.println("전사 타입의 외모를 꾸밉니다.");
    }

    @Override
    void selectSkill() {
        System.out.println("전사 타입의 스킬을 선택합니다.");
    }
}
