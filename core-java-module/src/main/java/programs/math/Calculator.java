package programs.math;

/**
 * Calculator
 *
 * @author
 * @since
 */
public class Calculator {
    private int x;
    private int y;
    private int z;


    /**
     * Parameterized Constructor.
     *
     * @param x input x
     * @param y input y
     */
    public Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
     * Add x and y
     */
    public void add(){
        System.out.println(x+y);
    }
    public void subtract(){
        System.out.println(x-y);
    }
    public void division(){
        System.out.println(x/y);
    }
    public void multiply(){
        System.out.println(x*y);
    }

    /**
     * Add x y
     * @return sum z
     */
    public int addr(){
        z=x+y;
        return z;
    }
    public int  subtractr(){
        z=x-y;
        return z;
    }
}

