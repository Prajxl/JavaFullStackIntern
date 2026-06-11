package MODULE1;

import java.util.HashSet;

public class UniqueString {
    public static void main(String[] args) {
        String s="abcddllpp";
        if(isUnique(s))
        {
            System.out.println("Unique");
        }else {
            System.out.println("Not");
        }
    }
    public static boolean isUnique(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        for (int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(hs.contains(ch))
            {
                return false;
            }
            else {
                hs.add(ch);
            }
        }
        return true;
    }

}
