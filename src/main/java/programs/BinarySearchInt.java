package programs;

/**
 * Binary search on a sorted array
 *
 * @author Ankit Rawat
 * @since 01 Jan 2023
 */
public class BinarySearchInt {

    /**
     *Apply binary search using recursive method
     *
     * @param arr-array to apply binary search on
     * @param l-lower index to apply search
     * @param r-higher index to apply search
     * @param x-element to find index of
     * @return mid-index where the x is located
     * @return -1-if the element is not present in array
     * @return binarySearchIntArr-for recursive search
     */
    public int binarySearchIntArr(int[]arr,int l, int r, int x){

        if (r>=l){
            int mid=l+(r-l)/2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearchIntArr(arr, l, mid - 1, x);
            else
                return binarySearchIntArr(arr, mid + 1, r, x);
        }
        return -1;
    }
}
