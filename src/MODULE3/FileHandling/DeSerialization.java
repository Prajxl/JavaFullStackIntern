package MODULE3.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:/Users/Acer/OneDrive/Desktop/FileIo/Resource.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person s = (Person) ois.readObject();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.gender);
    }
}
