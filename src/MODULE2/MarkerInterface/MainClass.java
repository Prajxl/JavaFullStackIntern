package MODULE2.MarkerInterface;

public class MainClass {
    public static void main(String[] args) {
        SourceCode sc = new SourceCode();
        Repo.review(sc);
        ByteCode bc = new ByteCode();
        Repo.review(bc);
    }
}
