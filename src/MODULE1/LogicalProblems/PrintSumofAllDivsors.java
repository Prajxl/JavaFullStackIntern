package MODULE1.LogicalProblems;

public class PrintSumofAllDivsors {
    public static void main(String[] args) {
        int num=10;
        int a=1;
        int sum=0;
        while (a<=(num/2))
        {
            if(num%a==0)
            {
                sum+=a;
            }
            a++;
        }
        System.out.println("Sum : "+sum);
    }
}
