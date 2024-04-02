package ra.java8.interfaces;

public class Test {
    public static void main(String[] args) {
        // call defaultMethod vs staticMethod
        Colorable.staticMethod(); // static

        Shape shape = new Shape();
        shape.displayColor();
        shape.defaultMethod();
    }
}
