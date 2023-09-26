package solid.ocp;

public class OCP {
    /** 개방 - 폐쇄 원칙
     *
     * 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
     *
     * 확장(Extension)에는 열려 있어야 함 :
     *      새로운 기능 또는 모듈을 추가할 때 기존 코드를 수정하지 않고 확장 가능해야 함.
     * 수정(Modification)에는 닫혀 있어야 함 :
     *      기존 코드는 수정하지 않고, 새 기능 추가 버그 수정할 수 있어야 함.
     *
     * 시스템의 변경과 유지보수를 유연하게 만드는 원칙
     */
}

// OCP가 준수 된 경우 (추상화가 되어 있다.)
interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}

class DrawingSystem {
    public void drawShape(Shape shape) {
        shape.draw();
        // OCP가 잘 안 지켜진 경우 새로운 기능이 추가되면 시스템의 코드도 추가 변경이 있어야 한다.
        /*
        if (shape.getClass() == Rectangle.class) {
            Rectangle rectangle = new Rectangle;
            rectangle.draw();
        } else if (shape instanceof Circle) {
            Circle circle = new Circle();
            circle.draw();
        }

         */
    }

}

class ShapeTest {
        public static void main(String[] args) {
            DrawingSystem drawingSystem = new DrawingSystem();

            drawingSystem.drawShape(new Circle());
            drawingSystem.drawShape(new Rectangle());

        // 새로운 도형을 추가
        class Triangle implements Shape {
            @Override
            public void draw() {
                System.out.println("삼각형을 그립니다.");
            }
        }

        // 기존 코드에 변경이나 수정 없이 새로운 기능 추가 가능
        drawingSystem.drawShape(new Triangle());
    }
}