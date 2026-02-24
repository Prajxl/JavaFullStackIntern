package MODULE1.ARRAYS;

public class P2 {
    public static void main(String[] args) {

        // Double Array Declaration

        double[] dArr={8.2,8.3,8.5,9.5};
        for (int i = 0; i < dArr.length; i++) {
            System.out.println(dArr[i]);
        }


        // Float Array Declaration

        float[] ft = new float[3];
        ft[0]=1.3f;
        ft[1]=2.3f;
        ft[2]=4.5f;
        for (int i = 0; i < ft.length; i++) {
            System.out.println(ft[i]);
        }

        char[] ch = {'J','S','p','i','d'};
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }

}
