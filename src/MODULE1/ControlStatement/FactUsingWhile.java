package MODULE1.ControlStatement;

public class FactUsingWhile {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        while (n>=1)
        {
            fact=n*fact;
            n--;
        }
        System.out.println(fact);
    }
}
