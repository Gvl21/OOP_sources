package inheritance;

public class 고래 extends 포유류 implements 헤엄칠수있는{
    고래(){
        kind = "고래";
    }

    @Override
    public void swim() {
        System.out.println(kind + "가 우아하게 헤엄칩니다.");
    }
}
