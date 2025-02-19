interface Testable {
    void display();
}

class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Display method from Test class.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

abstract class AbsTest implements Testable {
}