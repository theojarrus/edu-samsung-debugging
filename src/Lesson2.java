import java.io.IOException;

public class Lesson2 {

    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (NullPointerException exception) {
            System.out.println("catch NullPointerException");
        } catch (ArithmeticException exception) {
            System.out.println("catch ArithmeticException");
        } catch (Exception exception) {
            System.out.println("catch Exception");
        }

        System.out.println("end");
    }
}
