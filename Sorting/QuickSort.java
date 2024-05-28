package Sorting;

public class QuickSort {
    
    public  int pivot(int[] arr, int start,int end)
    {
        int i = start+1;
        int swap = start;    
        int pivot = start;
        while(i<=end)
        {
            if(arr[i] < arr[pivot])
            {
                swap++;
                swap(arr, i, swap);
            }
            i++;
        }
        swap(arr,swap,pivot);
        return swap;
    }

    private void sort(int[] arr, int start,int end)
    {
       if(start>end) return;
       int pivot = pivot(arr, start, end);
       sort(arr, start, pivot-1);
       sort(arr,pivot+1,end);
    }
    public void sort(int[] arr)
    {
        sort(arr,0,arr.length-1);
    }




    private static void swap(int[] arr, int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
