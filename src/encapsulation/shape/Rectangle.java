package encapsulation.shape;


import encapsulation.shape.Shape;

public class Rectangle extends Shape {
    private void rectangle() {
        System.out.println("사각형");
    }

    @Override
    public void draw() {
        rectangle();
    }
}
