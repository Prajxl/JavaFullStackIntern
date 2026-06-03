package MODULE3.sTRING;

public class BufferBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Prajwal ");
        System.out.println(builder.hashCode());
        builder.append("Full Stack Developer");
        System.out.println(builder.hashCode());
        System.out.println(builder.toString());
        System.out.println("---------------------------------");
        StringBuffer buffer = new StringBuffer("I am ");
        System.out.println(buffer.hashCode());
        buffer.append("Full Stack developer");
        System.out.println(buffer.hashCode());
        System.out.println(buffer.toString());

    }
}
