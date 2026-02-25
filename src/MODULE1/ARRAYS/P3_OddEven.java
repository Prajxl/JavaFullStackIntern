package MODULE1.ARRAYS;

public class P3_OddEven {
    public static void main(String[] args) {
        int[] arr={12,14,15,13,17,16};
        for (int i=0;i<arr.length;i++)
        {

            if(arr[i]%2!=0)   // Odd Number = if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }

    }
}
