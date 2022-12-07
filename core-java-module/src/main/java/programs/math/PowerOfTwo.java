package programs.math;
/**
 * Power Of Two
 *
 * @author AnkitRawat
 * @since 07 Dec 2022
 */
public class PowerOfTwo {

    boolean Pow(int n) {
        if (n == 0 || n==1)
            return false;

        while (n != 1) {
            if (n%2!= 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        PowerOfTwo powerOfTwo=new PowerOfTwo();
        boolean po2=powerOfTwo.Pow(n);
        if (po2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}