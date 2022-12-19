package exception;
/**
 * Arithmetic exception
 *
 * @author AnkitRawat
 * @since 14 Dec 2022
 */

public class ArithmeticException {
    /**
     * Divide x by y and catch arithmetic exception
     * Unchecked Exception
     *
     * @param x-Nominator number
     * @param y- Denominator number
     */

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