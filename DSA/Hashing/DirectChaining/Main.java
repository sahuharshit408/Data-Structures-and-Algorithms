package DSA.Hashing.DirectChaining;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insert("Java");
        directChaining.insert("is");
        directChaining.insert("High");
        directChaining.insert("Level");
        directChaining.insert("Language");
        directChaining.display();
        directChaining.search("high");
        directChaining.delete("Level");
        directChaining.display();
    }
}
