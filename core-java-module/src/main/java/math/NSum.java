package math;

/**
 * Sum of N numbers
 *
 * @author Kshitij
 * @since 7 Dec, 2022
 */
public class NSum {
    int n;

    /**
     * Sum of n no's
     * @param n
     */
    public void sumN(int n) {
        int sum =0;
        for(int i=1; i <=n; i++)
            sum+=i;
        System.out.println("Sum of No's" + sum);
    }
}
