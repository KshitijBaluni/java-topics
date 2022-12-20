package exception;

public class NumberFormatExceptionTest {
    public static void main(String[] args) {
        NumberFormatException numberFormatException=new NumberFormatException();
        String x=null;
        numberFormatException.numberFormat(x);
    }
}
