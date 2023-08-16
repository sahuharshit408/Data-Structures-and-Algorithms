package DSA.Hashing.DoubleHashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashing doubleHashing = new DoubleHashing(13);
        doubleHashing.insert("Java");
        doubleHashing.insert("is");
        doubleHashing.insert("High");
        doubleHashing.insert("Level");
        doubleHashing.insert("Language");
        doubleHashing.display();
        doubleHashing.search("Java");
    }
}
