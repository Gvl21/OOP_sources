package encapsulation.shape;

// 디자인 패턴 : 팩토리 패턴
// Shape에 관련된 자식 객체를 찍어내는 공장 클래스
public class ShapeFactory {
    Shape createRectangle() {       // 리턴타입은 Shape
        return new Rectangle();     // 리턴시 만드는 객체는 사각형
    }

    Shape createTriangle() {
        return new Triangle();
    }

}
