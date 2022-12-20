package collections;

import java.util.ArrayList;
/**
 * Find element in Arraylist
 *
 * @author Ankit Rawat
 * @since 16 Dec 2022
 */

public class FindInArraylist {
     /**
     *Parameterized Constructor
     *
     * @param arr-arraylist
     * @param x- element to find
     */
    private ArrayList<Integer> arr;
    private int x;
    public FindInArraylist(ArrayList<Integer> arr, int x) {
        this.arr=arr;
        this.x=x;

    }
    public boolean findArrayForEach(){
        /**
         * find element in arraylist taking param from constructor using for each
         *
         * @return true or false
         */
        for (int y:arr) {
            if (y == x)
                return true;
        }
        return false;
    }


    public boolean findArrayForEach(ArrayList<Integer> fia, int x){
        /**
         * find element in arraylist using parameterized function and for each loop
         *
         * @param fia- arraylist
         * @param x- element to find
         * @return true or false
         */
        for (int y:fia) {
            if (y == x)
                return true;
        }
        return false;
    }
    public boolean arrayFind(ArrayList<Integer> fia, int x ){
        /**
         * find element in arraylist using parameterized function using for loop
         *
         * @param fia- arraylist
         * @param x- element to find
         * @return true or false
         */

        for (int i = 0; i < fia.size(); i++)
        {
            System.out.println( fia.get(i));

            if (fia.get(i)==x){
                return true;
            }

        }
        return false;
    }

    public boolean arrayFind(){
        /**
         * find element in arraylist taking param from constructor using for loop
         *
         * @return true or false
         */

        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println( arr.get(i));

            if (arr.get(i)==x){
                return true;
            }

        }
        return false;
    }
}
