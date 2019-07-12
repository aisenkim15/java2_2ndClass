package java2_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DobleExam {

    public static void main(String[] args) {
        int num = 50;
        Scanner scan = null;

        try {
            System.out.println("숫자를 입력하세요");
            scan = new Scanner(System.in);
            int value = scan.nextInt();
            System.out.println(num / value);
        } catch (NullPointerException e) {
            System.out.println("Null point exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if (scan != null) {
                scan.close();
            }
        }

    }
}
