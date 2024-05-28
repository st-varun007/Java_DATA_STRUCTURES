package Sorting;

import java.util.Arrays;

public class MergeSort {
    
    public int[] merge(int[] arr1,int[] arr2)
    {
        int len1= arr1.length;
        int len2= arr2.length;
        int i=0;
        int j =0;
        int[] ans  = new int[len1+len2];
        int k = 0;
        while(i<len1 && j< len2)
        {
            if(arr1[i]<arr2[j])
            {
                ans[k++] = arr1[i];
                i++;
            }
            else
            {
                ans[k++]=arr2[j];
                j++;
            }
        }
        while(i<len1)
        {
            ans[k++]=arr1[i++];
        }
        while(j<len2)
        {
            ans[k++]=arr2[j++];
        }

        return ans;
    }
    //{3,1,4,2}
    public int[] sort(int[] arr)
    {
        if(arr.length == 1) return arr;
         
        int[] arr1=sort(Arrays.copyOfRange(arr,0,(arr.length/2)));
        int[] arr2=sort(Arrays.copyOfRange(arr,(arr.length/2),arr.length));

        return merge(arr1, arr2);
    }
   
}
