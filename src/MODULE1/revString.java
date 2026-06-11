package MODULE1;

import java.util.Arrays;

public class revString {
    public static void main(String[] args) {
        String s = "ram is good";
        String a[]=s.split(" ");
        System.out.println(Arrays.toString(a));
        String rev=" ";
        for(int i=a.length-1 ;i>=0;i--)
        {
            rev+=a[i]+" ";
        }
        System.out.println(rev);
    }

}
