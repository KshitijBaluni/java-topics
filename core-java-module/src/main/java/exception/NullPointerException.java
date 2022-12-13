package exception;

public class NullPointerException {
    public void nullPointer(String x) {
        String str = null;
        try {
            if (str.equalsIgnoreCase("ankit"))
                System.out.println("ankit is present");
            else {
                System.out.println("ankit is not present");
            }

        } catch (java.lang.NullPointerException e) {
            System.out.println("String is null " + e);

        }
    }
}
