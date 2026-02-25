package MODULE1.ARRAYS;

public class P6_LargestnArray {
    public static void main(String[] args) {
        int[] arr={14,12,17,16,19,15};
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println("Largest Element= "+large);
    }
}
