package encapsulation.shape;

public class Triangle extends Shape{
    private void triangle(){
        System.out.println("삼각형");
    }
    @Override
    public void draw() {
        triangle();
    }
}
