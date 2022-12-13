package exception;

public class ArithmeticException {
    public void artemis(int x, int y) {
        int div;
        try {
            div = x / y;
            System.out.println(div);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("cant divide by 0 " + e);
        }
    }
}