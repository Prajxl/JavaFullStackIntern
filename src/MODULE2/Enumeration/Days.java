package MODULE2.Enumeration;

public enum Days {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
class MainClass2{
    public static void main(String[] args) {
        Days d = Days.FRIDAY;
        System.out.println(d);
        System.out.println("==============");
        Days[] arr = Days.values();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
