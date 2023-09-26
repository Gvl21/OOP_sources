package solid.lsp.keep;

class Bird {
    protected String name;
    Bird() {
        this.name = "새";
    }
    public void move() {
        System.out.println(name+"가 움직입니다.");
    }
}

class Sparrow extends Bird {
    Sparrow() {
        name = "참새";
    }
    public void fly() {
        System.out.println("참새가 날아갑니다.");
    }
}

class Ostrich extends Bird {
    Ostrich() {
        name = "타조";
    }

}

public class AnimalTest {
    public static void main(String[] args) {
        // LSP를 준수한 경우
        Sparrow sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        sparrow.move();
        sparrow.fly();
        ostrich.move();
    }


}
