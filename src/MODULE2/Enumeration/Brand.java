package MODULE2.Enumeration;

public enum Brand {
    APPLE,REALME,SAMSUNG,OPPO,VIVO,REDMI
}
class ShowRoom{
    public static void main(String[] args) {
        Brand choice = Brand.OPPO;
        switch (choice)
        {
            case OPPO : System.out.println("Cheap");
            break;
            case APPLE : System.out.println("PREMIUM");
            break;
            case SAMSUNG: System.out.println("CAMERA");
            break;
            default:
                System.out.println("No Phone");
            break;


        }
    }
}
