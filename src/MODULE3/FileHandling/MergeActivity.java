package MODULE3.FileHandling;

import MODULE3.sTRING.BufferBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeActivity {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("C:/Users/Acer/OneDrive/Desktop/FileIo/Hero.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("C:/Users/Acer/OneDrive/Desktop/FileIo/Heroine.txt"));
        PrintWriter writer = new PrintWriter("C:/Users/Acer/OneDrive/Desktop/FileIo/Heroine.txt");
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
        while(line1!=null || line2!=null)
        {
            if(line1!=null)
            {
                writer.println(line1);
                line1 = reader1.readLine();
            }
            if(line2!=null)
            {
                writer.println(line2);
                line2=reader2.readLine();
            }
        }
        writer.flush();
        System.out.println("Merge Completed");
        writer.close();
        reader2.close();
        reader1.close();
    }
}
