package inheritance;

public class 펭귄 extends 조류 implements 헤엄칠수있는{
    펭귄(){
        kind = "펭귄";
    }

    @Override
    public void swim() {
        System.out.println(kind + "이 차가운 물에서 헤엄칩니다.");
    }
}
