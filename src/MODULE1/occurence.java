package MODULE1;

public class occurence {
    public static void main(String[] args) {
      String s = "abcbdbaj";
//
//        boolean b[] = new boolean[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (b[i]==false) {
//                int count = 1;
//
//                for (int j = i + 1; j < s.length(); j++) {
//
//                    if (s.charAt(i) == s.charAt(j)) {
//                        count++;
//                        b[j] = true;
//                    }
//                }
//
//                if(count==1) {
//                    System.out.println(s.charAt(i) + " " + count);
//                }
//            }
//        }

        int freq[]= new int[128];
        for (int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<= freq.length-1;i++)
        {
            if(freq[i]>0)
                System.out.println((char) i +" "+freq[i]);
        }
    }
}