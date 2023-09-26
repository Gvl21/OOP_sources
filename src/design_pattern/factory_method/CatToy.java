package design_pattern.factory_method;

// 구체적(Concrete) 제품(Product) 클래스 실제 객체를 나타내는 클래스
public class CatToy extends AnimalToy {

    @Override
    void show() {
        System.out.println("안녕, 나는 캣타워야! 고양이 장난감이지.");
    }
}
