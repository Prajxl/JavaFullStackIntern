package MODULE1;

public class mostR {
    public static void main(String[] args) {
        String s = "abcddeeeeff";
        int freq[] = new int[128];
        int maxFreq=0;
        char mostR = s.charAt(0);
        for (int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i=0;i<= freq.length-1;i++)
        {
            if(freq[i]>maxFreq)
            {
                maxFreq=freq[i];
                mostR = (char) i;
            }
        }
        System.out.println(mostR+" "+maxFreq);
    }
}
