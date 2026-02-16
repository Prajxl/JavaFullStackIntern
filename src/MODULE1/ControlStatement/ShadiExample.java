package JavaJspiders.src.MODULE1.ControlStatement;

public class ShadiExample {
    public static void main(String[] args) {
        char gender='M';
        int age=25;
        if(gender=='M')
        {
            if(age>=21)
            {
                System.out.println("Eligible Bachelor");
            }else
            {
                System.out.println("Boy under age");
            }
        } else if (gender=='F') {
            if(age>=18)
            {
                System.out.println("ELigible Spinster");
            }else
            {
                System.out.println("Girl Under Age");
            }
        }else
        {
            System.out.println("Invalid Gender");
        }
    }
}
