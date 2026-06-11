package MODULE1;

import java.util.Arrays;

public class AscDesc {
    public static void main(String[] args) {
        int a[]={1,4,3,2,5,8,7,6};
        System.out.println(Arrays.toString(ascending(a)));
    }
    static int [] ascending(int [] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

}
