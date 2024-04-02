package ra.java8.interfaces;
@FunctionalInterface
public interface Colorable {
    // Hang so , abstract method
    void displayColor();
//    void getColor();
    // tu khoa default , static
    default void defaultMethod(){
        System.out.println("default method");
    }
    static void staticMethod (){
        System.out.println("static method");
    }
}
