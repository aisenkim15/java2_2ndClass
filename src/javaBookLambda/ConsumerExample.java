package javaBookLambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("Java");

        BiConsumer<String, String> biConsumer = (t, s) -> {System.out.println(t + s);};
        biConsumer.accept("Java", "8");

        DoubleConsumer dc = d -> System.out.println("this is double: " + d);
        dc.accept(3.12323);

        ObjIntConsumer<String> oic = (o,i) -> {
            System.out.println("This is Object: " + o);
            System.out.println("This is integer: " + i);
        };
        oic.accept("Hello", 5);

    }
}
