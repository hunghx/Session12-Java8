package ra.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // khoi tao doi tuong functional interface bang cu phap lambda
        // cu phap lambda (args)->{method body}
        Moveable moveable = ()->{
            System.out.println("Dang di chuyen");
        };
        Comparator<String> stringComparator = (o1, o2) -> o2.compareTo(o1) ;

        List<String> list = Arrays.asList("Hung","Nam","Duc", "Thong","Ngoc");
//
//        Stream<String> stream1 =  list.stream(); // mo stream
//        // thao tac trung gian
//        Stream<String> stream2 = stream1.filter(s -> s.length()>=4);
//        // thao tac trung gian
//        Stream<String> stream3 = stream2.sorted((o1,o2)->o1.compareTo(o2));
//        // in ra
//        stream3.forEach(str->{
//            System.out.println(str);
//        });


        list.stream().filter(s -> s.length()>=4)
                //.sorted((o1, o2) -> o1.compareTo(o2))  //
                .sorted(String::compareTo)  //
                //.forEach(s -> System.out.println(s));
                .forEach(System.out::println);

        // Cac functional interface thuong dung : Predicate, Consumer ,Function , Supplier
        // cacs thao tac hay dung vs stream
        // thao tac trung gian : filter, sorted, limit , distinct, map , skip
        // thao  tac dau cuoi : foreach , count, reduce,allMatch, anyMatch ,collect, sum , max, min,findAny, findFirst,...

//        method references - tham chieu cua phuong thuc


    }
}
