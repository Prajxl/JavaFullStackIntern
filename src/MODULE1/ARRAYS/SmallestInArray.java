package MODULE1.ARRAYS;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr={14,12,17,16,19,15};
        int smallest=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                System.out.println(smallest);
                smallest=arr[i];

            }
        }
        System.out.println("Smallest in Array="+smallest);
    }
}
