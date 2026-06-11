import java.util.*;

class removeDupl {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50,40};

        int[] b = removeDuplicate(a);

        Arrays.sort(b);

        int n = 2;

        if(n>=1 && n<=b.length)
        {
            System.out.println(b[n-1]+" Smallest");
            System.out.println(b[b.length-1]+" Biggest");
        }
    }

    static int[] removeDuplicate(int a[])
    {
        HashSet<Integer> hs=new HashSet<>();

        for(int ele:a)
            hs.add(ele);

        int[] b=new int[hs.size()];

        int i=0;

        for(int ele:hs)
            b[i++]=ele;

        return b;
    }
}