package DSA.Trie;

public class Main {

    public static void main(String[] args) {

        Trie newTrie = new Trie();
        newTrie.insert("Harsh");
        newTrie.insert("Harshit");
        newTrie.Search("Harshit");
        newTrie.delete("Harshit");
        newTrie.Search("Harshit");
    }
}
