package MODULE2.POLYMORPHISM.RunTimePolymorphism.FACEBOOK;

public class MainClass {
    public static void main(String[] args) {
        FacebookMobile fM = new FacebookMobile();
        ViewManager.adapt(fM);
        FacebookWebsite fW = new FacebookWebsite();
        ViewManager.adapt(fW);
        FacebookTab tb = new FacebookTab();
        ViewManager.adapt(tb);
    }
}
