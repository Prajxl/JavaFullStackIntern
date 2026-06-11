package MODULE3.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableClass {
    public static void main(String[] args) throws IOException {
        Person p = new Person("Prajwal",21,'M');
        FileOutputStream fos = new FileOutputStream("C:/Users/Acer/OneDrive/Desktop/FileIo/Resource.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("Serialization Completed");
        oos.close();
        fos.close();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.gender);
    }
}
