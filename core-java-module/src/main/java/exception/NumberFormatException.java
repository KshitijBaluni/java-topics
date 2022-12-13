package exception;

public class NumberFormatException {
    public void numberFormat(String x) {
    try {
        Integer.parseInt(x);
    }
        catch (java.lang.NumberFormatException e){
        System.out.println("format is not correct");
    }
}
}
