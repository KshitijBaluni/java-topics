package collections.list;

/**
 * Indexes which will sum unto a target in an array
 *
 * @author Ankit Rawat
 * @since 02 Jan 2023
 */
public class SumUpToTarget {

    /**
     *Find indexes to sum to a target
     *
     * @param arr-array to find the indexes to sum upto x
     * @param x-target
     * @return ind-indexes which are summing unto target.
     */
    public int[] findIndex(int[] arr, int x){
        int[] ind={-1,-1};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==x){
                    ind[0]=i;
                    ind[1]=j;
                    return ind;
                }
            }
        }
        return ind;
    }
}
