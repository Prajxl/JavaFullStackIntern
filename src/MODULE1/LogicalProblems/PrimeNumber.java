package MODULE1.LogicalProblems;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=29;
        int a=1;
        int count=0;
        while (a<=(num/2))
        {
            if(num%a==0)
            {
                count++;
            }
            a++;
        }
        if(count==1)
        {
            System.out.println(num+" is a Prime Number ");
        }else {
            System.out.println(num+" Not a Prime number");
        }
    }
}
