package MODULE1.ARRAYS;

public class P5_SumOfArray {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={12,10,13,14,15};
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];

        }
        System.out.println("Array sum= "+sum);
        int avg=sum/arr.length;
        System.out.println("Array avg= "+avg);
    }
}
