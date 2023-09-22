package inheritance;

public class AnimalTest03 {
    public static void main(String[] args) {
        // 하위 클래스는 상위클래스다
        // is - a 관계 : 상속
        // 더 명확한 표현 : is a kind of 관계
        // bird is a kind of animal
        // penguin is a kind of animal
        // pororo is a kind of penguin ( 클래스의 인스턴스화 : 객체)

        // 하위 클래스 is a kind of 상위클래스
        // 하위클래스느 상위 클래스의 한 분류다.

        동물[] animals = new 동물[7];

        animals[0] = new 동물();
        animals[1] = new 조류();
        animals[2] = new 포유류();
        animals[3] = new 고래();
        animals[4] = new 박쥐();
        animals[5] = new 참새();
        animals[6] = new 펭귄();
        for (동물 animal : animals) {
            animal.showMe();
        }
    }
}
