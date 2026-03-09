package MODULE1.Method;

public class prime {
    static boolean checkPrime(int n)
    {
        int count=0;
        int a=1;
        while(a<=n/2)
        {
            if(n%a==0)
            {
                count++;
            }
            a++;
        }
        if(count==1)
        {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n=29;
        boolean isPrime = checkPrime(n);
        if(isPrime)
        {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
