package MODULE1.ARRAYS;

import java.util.Arrays;

public class SortAuto{
    static void disp(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={14,12,15,18,16};
        System.out.println("Before Sorting");
        disp(arr);
        Arrays.sort(arr);
        System.out.println("After sorting");
        disp(arr);
    }
}
