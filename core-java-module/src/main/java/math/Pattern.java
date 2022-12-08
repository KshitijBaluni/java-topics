package math;

/**
 * Print pattern
 * 1
 * 23
 * 456
 *
 * @author Kshitij Baluni
 * @since 8 Dec, 2022
 */
public class Pattern {

    /**
     * Print pattern
     *
     * @param n till n
     */
    public void pattern(int n){
        int value=1;
        int count =0;
        for (int i=1; i<=n;i++) {
            System.out.print(i);
            count++;
            if (count == value) {
                System.out.println();
                count=0;
                value++;
            }
        }
    }
}
