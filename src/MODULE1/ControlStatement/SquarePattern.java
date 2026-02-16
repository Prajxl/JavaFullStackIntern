package JavaJspiders.src.MODULE1.ControlStatement;

public class SquarePattern {
    public static void main(String[] args) {
        /*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/
        int n=5;
        int val=1;
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(val+" "); // we can use i+1;
            }
            System.out.println();
            val++;
        }
/*
a a a a a
b b b b b
c c c c c
d d d d d
e e e e e
 */
        char ch='a';
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(ch+" "); // we can use i+1;
            }
            System.out.println();
            ch++;
        }
/*  EX 4
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/
        int VAL=5;
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(VAL+" "); // we can use i+1;
            }
            System.out.println();
            VAL--;
        }

/* Ex 5 :
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5

 */

        for (int i=0;i<n;i++)
        {
            int Num=1;
            for (int j = 0; j < n; j++) {
                System.out.print(Num+" ");
                Num++; // we can use i+1;
            }
            System.out.println();
        }
/*
a b c d e
a b c d e
a b c d e
a b c d e
a b c d e
*/
        for (int i=0;i<n;i++)
        {
            char character='a';
            for (int j = 0; j < n; j++) {
                System.out.print(character+" ");
                character++; // we can use i+1;
            }
            System.out.println();
        }
/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/
        for (int i=0;i<n;i++)
        {
            int Num=5;
            for (int j = 0; j < n; j++) {
                System.out.print(Num+" ");
                Num--; // we can use i+1;
            }
            System.out.println();
        }
    }
}
