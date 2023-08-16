package DSA.Hashing.QuadraticProbing;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing = new QuadraticProbing(13);
        quadraticProbing.insert("Java");
        quadraticProbing.insert("is");
        quadraticProbing.insert("High");
        quadraticProbing.insert("Level");
        quadraticProbing.insert("Language");
        quadraticProbing.display();
    }
}
