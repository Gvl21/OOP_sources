package inheritance;

public class 참새 extends 조류 implements 날수있는{
    String kind;
    참새(){
        kind = "참새";
    }

    @Override
    public void fly() {
        System.out.println(kind + "가 짹짹하고 날아다닙니다.");
    }
}
