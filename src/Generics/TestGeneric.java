package Generics;

public class TestGeneric {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();

        Box<String> stringBox = new Box<>();
        stringBox.set("What ever");
        Box rawBox = stringBox;
        System.out.println(rawBox.get());

        Box newBox = new Box();
        newBox.set(123);
        Box<Integer> newerBox = newBox;
        System.out.println(newerBox);
    }
}

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}