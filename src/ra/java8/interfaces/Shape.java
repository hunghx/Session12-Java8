package ra.java8.interfaces;

public class Shape implements Colorable{
    @Override
    public void displayColor() {
        System.out.println("color is red ");
    }

    @Override
    public void defaultMethod() {
        Colorable.super.defaultMethod();
    }
}
