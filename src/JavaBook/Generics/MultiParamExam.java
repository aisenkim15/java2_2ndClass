package JavaBook.Generics;

public class MultiParamExam {
    public static void main(String[] args) {
        MultiParam<String, Integer> product1 = new MultiParam<>();
        product1.setKind("Car");
        product1.setModel(1);

        String kind = product1.getKind();
        Integer model = product1.getModel();

        System.out.println(kind);
        System.out.println(model);
    }
}
