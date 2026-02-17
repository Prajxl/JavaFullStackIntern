package MODULE1.ControlStatement;

public class WHILE_LOOP {
    public static void main(String[] args) {

        int z=1,l=5,sum=0;
        while (z<=l)
        {
            if(z%2==0) {
                sum += z;
            }
            z++;
        }
        System.out.println("Sum : "+ sum);
        int num=4;
        int a=1,b=10;
        while (a<=b)
        {
            int product = num*a;
            System.out.println(num+" * "+a+" = "+product);
            a++;
        }
    }
}
