package java2_Exception;

public class ExceptionExam {

    public static void main(String[] args) {
        int a =10, b=0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program ended");
    }

}
