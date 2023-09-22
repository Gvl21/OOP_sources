package inheritance;

public class 박쥐 extends 포유류 implements 날수있는{
    박쥐(){
        kind = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println(kind + "가 동굴 속에서 날아다닙니다.");
    }
}
