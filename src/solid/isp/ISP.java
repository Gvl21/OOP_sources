package solid.isp;

public class ISP {
    /**
     * 인터페이스(Interface) 분리(Segregation) 원칙
     * 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
     *
     * 구현 클래스(클라이언트)가 사용하지 않는 메서드에 의존하지 않도록 인터페이스를 더 작게 분리
     * 의존성 제거, 유지보수성 향상.
     *
     * - 인터페이스를 실체 클라이언트에게 맞춰서 사용
     * - 하나의 큰 인터페이스 대신 여러개의 작은 인터페이스 사용
     * - 사용하지 않는 메서드가 포함된 인터페이스를 엄격하게 분리
     */
}

// ISP 위반 사례
interface IMultiDevice {
    void print();
    void scan();
    void fax();
}

// ISP 적용하여 인터페이스 분리
interface Printable {
    void print();
}

interface Scanable {
    void scan();
}

interface Faxable {
    void fax();
}

class BasicPrinter implements Printable {

    @Override
    public void print() {

    }
}

class PrintScanner implements Printable, Scanable {

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}

class MultiDevicePrinter implements Printable, Scanable, Faxable {

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }

    @Override
    public void fax() {

    }
}

// 복합기에서는 세 가지 기능을 모두 사용 (O)
class MultiDevice implements IMultiDevice {

    @Override
    public void print() {
        // 출력
    }

    @Override
    public void scan() {
        // 스캔
    }

    @Override
    public void fax() {
        // 팩스
    }
}

// 프린터에서는 불필요한 기능들이 추가되었음 (X)
class Printer implements IMultiDevice {

    @Override
    public void print() {
        System.out.println("프린트 잘됨");
    }

    @Override
    public void scan() {
        System.out.println("스캐너는 안됩니다.");
    }

    @Override
    public void fax() {
        System.out.println("팩스도 안됩니다.");
    }
}