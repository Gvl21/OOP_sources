package inheritance;

public class AnimalTest01{
    public static void main(String[] args) {
        // 상속관계에서 하위 클래스는 상위 클래스의 모든 필드와 메소드를 보유함
        동물 animal = new 동물();
        조류 bird = new 조류();
        포유류 mammal = new 포유류();
        고래 whale = new 고래();
        박쥐 bat = new 박쥐();
        참새 spparow = new 참새();
        펭귄 penguin = new 펭귄();

        animal.showMe();
        bird.showMe();
        mammal.showMe();
        whale.showMe();
        bat.showMe();
        spparow.showMe();
        penguin.showMe();

    }
}
