package programs.String;
/**
 * Binary String
 *
 * @author AnkitRawat
 * @since 09 Dec 2022
 */
public class BinaryString {
    /**
     *convert string to binary and return ith index
     *
     * @param m-number which is to be changed into binary
     * @param n- how many times iteration
     * @param i-find the value at ith index
     * @return value at ith index
     */
    String concat = "";
    public String binString(int m, int n, int i) {
        String binaryConversion = Integer.toBinaryString(m);
        for (int k = 1; k <= n; k++) {
            for (int j = 0; j < binaryConversion.length(); j++) {
                if (String.valueOf(binaryConversion.charAt(j)).equals("0")) {
                    concat = concat + "01";
                } else {
                    concat = concat + "10";
                }
            }
            binaryConversion = concat;
        }
        return String.valueOf(binaryConversion.charAt(i));
    }
}