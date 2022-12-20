package collections;

import java.util.ArrayList;
/**
 * Append an element in an arraylist
 *
 * @author Ankit Rawat
 * @since 16 Dec 2022
 */
public class AppendInArraylist {
    /**
     *Append an element in an arraylist
     *
     * @param x-element to append
     */
    ArrayList<Integer> fia = new ArrayList<Integer>();
    public int  arrayFind(int x){
        fia.add(x);
        return (fia.get(fia.size()-1));

    }
}
