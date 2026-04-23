package MODULE3.OBJECTCLASS.Clone;

public class ImageClone {
    int size;

    public static void main(String[] args) throws CloneNotSupportedException {

        ImageClone original = new ImageClone();
        original.size=20;

        ImageClone edit = (ImageClone) original;
        System.out.println(edit.size);

    }
}
