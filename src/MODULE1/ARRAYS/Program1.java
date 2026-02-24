package MODULE1.ARRAYS;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int[] arr=new int[4];
//        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= sc.nextInt();
//        }

        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        arr[3]=15;

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
