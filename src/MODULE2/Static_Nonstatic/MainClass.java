package MODULE2.Static_Nonstatic;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Method is Running");
        System.out.println("X value= "+StaticMembers.x);
        System.out.println("Y value= "+StaticMembers.y);
        System.out.println("Reinitializing or Modifiying Static Variables ");
        StaticMembers.x=300;
        StaticMembers.y=400;
        System.out.println("X value= "+StaticMembers.x);
        System.out.println("Y value= "+StaticMembers.y);
        StaticMembers.test();
        System.out.println("Main Method is ended");
    }
}
