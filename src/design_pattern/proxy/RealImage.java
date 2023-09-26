package design_pattern.proxy;

// 실제 이미지 객체
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("이미지를 불러옵니다." + filename);
    }

    @Override
    public void display() {
        System.out.println("이미지를 보여줍니다." + filename);
    }
}
