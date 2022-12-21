package exception;

public class NumberFormatExceptionProg {
    /**
     * NumberFormatException exception
     *
     * @author Ankit Rawat
     * @since 14 Dec 2022
     */
    public void numberFormat(String x) {
        /**
         * Parse the incorrect number format and catch NumberFormatException
         * Unchecked Exception
         *
         * @param x- String to parse
         */
        try {
            Integer.parseInt(x);
        }
        catch (NumberFormatException e){
            System.out.println("format is not correct");
        }
    }
}