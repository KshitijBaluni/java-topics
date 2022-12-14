package programs.math;
/**
 * Calculator
 * 
 * @author Shivam
 * @since 12 Dec,2022
 */
public class Calculator {
    /**
     * Calculator
     *
     * @param program to Add/Sub
     * @return provide output of Add/Sub values
     */
    private int x;
    private int y;
    private int z;

    public Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void add()
    {System.out.println(x+y);}
    public void subtract(){
        System.out.println(x-y);
    }
    public void division()
    {
        System.out.println(x/y);
    }
    public void multiply()
    {
        System.out.println(x*y);
    }

    public int addr(){
        z=x+y;
        return z;
    }
    public int subtractr()
    {
        z=x-y;
        return z;
    }
}

