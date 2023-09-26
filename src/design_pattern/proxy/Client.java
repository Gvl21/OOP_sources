package design_pattern.proxy;

public class Client {
    public static void main(String[] args) {
        
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");
        
        // 이미지를 처음 로딩할 때 RealImage 생성
        image1.display();
        
        // 이미 로딩 되어있으면 다시 생성하지 않음.
        image1.display();
        
        // 새로운 이미지 생성
        image2.display();
        
    }
}
