package design_pattern.proxy;

// 대리자 역할을 하는 클래스
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    // 대리자 역할을 하며, 실제 이미지 로딩을 지연 시키고,
    // 이미 생성되어 있는 경우 다시 생성하지 않습니다.
    @Override
    public void display() {
        // 없을 경우 새로 만들어 줌
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        // 진짜 이미지를 보여줌
        realImage.display();
    }
}
