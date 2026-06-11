package MODULE1;

import java.util.Locale;

public class ConVow {
    public static void main(String[] args) {
        String s = "aeioulllkkkppp";
        int c=0,v=0;
        String s1 = s.toLowerCase(Locale.of(s));
        for(int i=0;i<s.length();i++)
        {
            char ch = s1.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
                {
                    v++;
                }else {
                    c++;
                }
            }
        }
        System.out.println("Consonent : "+c+" Vowel: "+v);
    }
}
