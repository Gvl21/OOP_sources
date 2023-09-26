package design_pattern.template_method;

public class Wizard extends GameCharacter {
    @Override
    void selectType() {
        System.out.println("마법사 타입을 선택합니다.");
    }

    @Override
    void customize() {
        System.out.println("마법사 타입의 외모를 꾸밉니다. 모자 쓰기, 지팡이 고르기");
    }

    @Override
    void selectSkill() {
        System.out.println("마법사 타입의 스킬을 선택합니다. 불마법, 물마법");
    }
}
