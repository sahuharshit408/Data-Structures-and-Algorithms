package DSA.Hashing.LinearProbing;

public class Main {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(15);
        linearProbing.insert("Java");
        linearProbing.insert("is");
        linearProbing.insert("High");
        linearProbing.insert("Level");
        linearProbing.insert("Language");
        linearProbing.delete("Java");
        linearProbing.display();
    }
}
