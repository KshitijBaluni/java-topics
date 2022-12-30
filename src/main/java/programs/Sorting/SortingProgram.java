package programs.Sorting;

import java.util.Arrays;

public class SortingProgram {
    public int[] loopSort(int[]arr){
        for (int i=0; i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public int[] arrSort(int []arr){
        Arrays.sort(arr);
        return arr;
    }
}
