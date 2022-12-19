package collections;

import java.util.ArrayList;
/**
 * Find element and index of Arraylist
 *
 * @author Ankit Rawat
 * @since 16 Dec 2022
 */
public class FindElementInArraylist {
    /**
     *Find element and index of Arraylist
     *
     * @param fia-arraylist
     * @param x-element to find
     * @return i- Element's index
     */
    public int  arrayFind(ArrayList<Integer> fia, int x){
        int result =0;
        for (int i = 0; i < fia.size(); i++)
        {
            //System.out.println( fia.get(i));
            int y= (int) fia.get(i);
            if (y==x){
                return i;
            }
        }
        return result;
    }
}
