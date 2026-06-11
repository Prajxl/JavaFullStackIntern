package MODULE1;

public class maxSub {
    public static void main(String[] args) {
        int a[]={2,3,4,5,1,2,2};
        int count=1,max=1;
        for (int i=0;i<=a.length-2;i++)
        {
            if(a[i]+1==a[i+1])
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }else{
                count=1;
            }
        }
        System.out.println(max);
    }
}
