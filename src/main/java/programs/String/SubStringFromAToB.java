package programs.String;
/**
 * Substring From A to B
 *
 * @author Ankit Rawat
 * @since 09 Dec 2022
 */
public class SubStringFromAToB {
    /**
     * Store substring of A to B from index a to b using substring inbuilt function
     *
     * @param s-String A
     * @param m-index of point a
     * @param n-index of point b
     * @return substring
     */
    public String dropString(String s, int m, int n) {
        return (s.substring(m, n));
    }
    /**
     * Store substring of A to B from index a to b using For loop
     *
     * @param s-String A
     * @param m-index of point a
     * @param n-index of point b
     * @return substring
     */
    public String dropStringArr(String s, int m, int n) {
        String subString = "";
        char[] arr = s.toCharArray();
        for (int i = m; i < n; i++) {
            subString = subString + arr[i];
        }
        return subString;
    }
}