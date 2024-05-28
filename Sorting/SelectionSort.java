package Sorting;

public class SelectionSort {
    public void sort(int[] arr)
    {
        int minIndex = 0;
        for(int i = 0 ;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j] && arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if(i!=minIndex)
            {
                int temp = arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
                minIndex = i+1;
            }
        }
    }
}
