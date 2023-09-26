package encapsulation.shape;

public class Test {
    public static void main(String[] args) {

        // 1차 : 정보 은닉 없음
//        Rectangle rectangle = new Rectangle();
//        rectangle.rectangle();
//        triangle.trinagle();

        // 2차 : 각각의 메소드들을 private으로 숨겨주고
        // 추상 메소드로 우회해서 호출한다.
        // 그러나 객체는 생성해야 한다. 드러남.
//        Shape shape = new Rectangle();
//        Shape shape2 = new Triangle();
//
//        shape.draw();
//        shape2.draw();

        // 3차 : 팩토리 패턴
        // 구체적인 객체에 대한 완벽한 정보 은닉
        // 팩토리 객체 생성
        ShapeFactory factory = new ShapeFactory();

        // 팩토리에서 자식 객체를 만드는 메소드 호출
        Shape shape = factory.createTriangle();
        Shape shape2 = factory.createRectangle();


        // shape에서 메소드 호출
        shape.draw();
        shape2.draw();


    }
}