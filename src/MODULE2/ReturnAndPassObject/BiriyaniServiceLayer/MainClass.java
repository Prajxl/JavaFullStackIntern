package MODULE2.ReturnAndPassObject.BiriyaniServiceLayer;

import MODULE2.ReturnAndPassObject.Helper;

public class MainClass {
    public static void main(String[] args) {
        Biriyani b1 = Hotel.cookBiriyani();
        Hotel.showBiriyani(b1);
        Biriyani b2 = Hotel.cookBiriyani();
        Hotel.showBiriyani(b2);
    }
}
