package MODULE1.ARRAYS;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr,int low,int high)
    {

        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while (s<=e)
        {
            while (arr[s]<pivot)
            {
                s++;
            }
            while (arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            quickSort(arr,low,e);
            quickSort(arr,s,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,1,5,2,3};
        int low=0;
        int high= arr.length-1;
        quickSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
