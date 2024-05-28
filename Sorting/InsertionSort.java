package Sorting;
public class InsertionSort{

    public void sort(int[] arr)
    {
        int len = arr.length;
        for(int i = 1;i<len;i++)
        {
            int j = i;
            while(j>0 && arr[j]< arr[j-1])
            {
                int temp = arr[j-1];
                arr[j-1]  = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}