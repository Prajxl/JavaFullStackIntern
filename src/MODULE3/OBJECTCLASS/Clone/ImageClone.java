package MODULE3.OBJECTCLASS.Clone;

public class ImageClone implements Cloneable {
    int size;

    public static void main(String[] args) throws CloneNotSupportedException {

        ImageClone original = new ImageClone();
        original.size=20;

        ImageClone edit = (ImageClone) original.clone();
        System.out.println(edit.size);
    }
}
