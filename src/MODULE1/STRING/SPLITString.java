package MODULE1.STRING;

public class SPLITString {
    public static void main(String[] args) {
        String str="Qspiders Jspiders Pysiders Prospiders";
        String[] arr=str.split(" "); // {"Qspiders","Jspiders","Pyspiders","Prospiders"};
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
