package MODULE1.LogicalProblems;

// Perfect Number - the Number which divisor sum is equal to that number 6 = 1+2+3 = 6
public class PerfectNumbers {
    public static void main(String[] args) {
        int num=6;
        int a=1;
        int sum=0;
        while (a<=(num/2))
        {
            if (num%a==0)
            {
                sum+=a;
            }
            a++;
        }
        if (sum==num)
        {
            System.out.println(sum+" Is a Perfect Number");
        }else {
            System.out.println(sum+" Is Not a Perfect Number");
        }

    }

}
