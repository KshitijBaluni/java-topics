package math;
/**
 * Power Of Two
 *
 * @author AnkitRawat
 * @since 07 Dec 2022
 */
public class PowerOfTwo {
    /**
     * Is power of 2 or not
     *
     * @param n- to check if its power of 2
     * @return true or false
     */
    boolean pow(int n) {
        if (n == 0 || n==1)
            return false;

        while (n != 1) {
            if (n%2!= 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}