package JavaBook.Generics;

public class CompareMethodExample {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");

        boolean result = Util.compare(p1, p2);

        if (result) {
            System.out.println("Two objects are completely identical");
        } else {
            System.out.println("Two objects aren't identical");
        }
    }
}
