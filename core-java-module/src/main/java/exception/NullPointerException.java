package exception;

public class NullPointerException {
    /**
     * NullPointer exception
     *
     * @author Ankit Rawat
     * @since 14 Dec 2022
     */
    public void nullPointer(String x) {
        /**
         * Compare a null String and catch null pointer exception
         * Unchecked Exception
         *
         * @param x- String to compare with
         */
        String str = null;
        try {
            if (str.equalsIgnoreCase(x))
                System.out.println("ankit is present");
            else {
                System.out.println("ankit is not present");
            }

        } catch (java.lang.NullPointerException e) {
            System.out.println("String is null " + e);

        }
    }
}