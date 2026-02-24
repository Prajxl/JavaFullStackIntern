package MODULE2.Static_Nonstatic;


// Non Statiic Member is called using = new ClassName.membername
/* Here Reintialization of the variable is not changed the value becuase here
 for every new Nonstatic() call the new copy of original NonStatic class is created called object
- new objects at every call copy of original value so the reinitialized value not reflected
 */
public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("Main Method is Running");
        System.out.println("X value= "+new NonStatic().x);
        System.out.println("Y value= "+new NonStatic().y);
        System.out.println("Reinitializing or Modifiying Non-Static Variables ");
        new NonStatic().x=300;
        new NonStatic().y=400;
        System.out.println("X value= "+new NonStatic().x);
        System.out.println("Y value= "+new NonStatic().y);
        new NonStatic().test();
        System.out.println("Main Method is ended");
    }

}
