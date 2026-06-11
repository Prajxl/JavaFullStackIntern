package MODULE1;

import java.util.HashSet;
import java.util.Locale;

public class isPanagram {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzss";
        String s1 = s.toLowerCase(Locale.of(s));
        if(isPanagram(s1))
        {
            System.out.println("Panagram");
        }else {
            System.out.println("Not Panagram");
        }

    }
    static boolean isPanagram(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                hs.add(ch);
            }
        }
        return hs.size()==26;
    }

}
