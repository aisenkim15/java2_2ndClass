package javaBookLambda;

public class MyFunctionalIterfaceExample {
    public static void main(String[] args) {
        MyFinctionalInterface fi;

        fi = (x, y) -> {
          int result = x + y;
          return result;
        };
        System.out.println(fi.method(2,5));

        fi = (x,y) -> {return x+y;};
        System.out.println(fi.method(2, 3));

        fi = (x,y) -> x+y;
        System.out.println(fi.method(2, 3));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(3,6));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
