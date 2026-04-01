package MODULE2.TypeCasting.UpCasting.AutoUpCasting;


public class Product {
}
class Tv extends Product{

}
class Ac extends Product{

}
class Socks extends Product{

}
class FlipKart {
    void AddtoCart(Product p)
    {
        if(p!=null)
            System.out.println("Product is Added");
    }
    void Buynow(Product p)
    {
        if (p!=null)
            System.out.println("Product Placed");
    }
}
class MainClass{
    public static void main(String[] args) {
        Socks s1 = new Socks();
        FlipKart fp = new FlipKart();
        fp.AddtoCart(s1);
        fp.Buynow(s1);
        Tv t1 = new Tv();
        fp.AddtoCart(t1);
        fp.Buynow(t1);

    }
}