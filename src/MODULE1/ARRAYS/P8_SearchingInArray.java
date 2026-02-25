package MODULE1.ARRAYS;

public class P8_SearchingInArray {
    public static void main(String[] args) {
        int[] arr = {14, 13, 10, 12, 16, 15, 13, 18};
        int element = 13;
        boolean present = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(element + " found in location " + i);
                present = true;
            }
        }
        if (present==false)
        {
            System.out.println(element+" Not found in Array");
        }
    }
}
