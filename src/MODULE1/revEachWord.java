package MODULE1;

public class revEachWord {
    public static void main(String[] args) {
        String s = "ram is good";
        String a[] = s.split(" ");
        String rev =" ";

        for (int i=0; i<= a.length-1;i++)
        {
            String revword = reverse(a[i]);

        }
    }
    static String reverse(String s)
    {
   return  new StringBuffer(s).reverse().toString();
    }
}
