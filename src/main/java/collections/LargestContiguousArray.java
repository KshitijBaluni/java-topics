package collections;

/**
 * Largest contiguous array sum
 *
 * @author Ankit Rawat
 * @since 03 Jan 2023
 */
public class LargestContiguousArray {

    /**
     *Largest contiguous array sum
     *
     * @param arr integer array
     * @return max_so_far largest contiguous sum in the array
     */
    public int largestSum(int[] arr)
    {
        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}