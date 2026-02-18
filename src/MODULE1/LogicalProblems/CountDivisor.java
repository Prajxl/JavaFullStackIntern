package MODULE1.LogicalProblems;

public class CountDivisor {
    public static void main(String[] args) {
        int num=12;
        int a=1;
        int count=0;
        while(a<=(num/2))
        {
            if(num%a==0)
            {
                count++;
            }
            a++;
        }
        System.out.println("Count of Number "+num+" is: "+count);
    }
}
