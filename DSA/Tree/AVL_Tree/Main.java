package DSA.Tree.AVL_Tree;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);
        newAVL.levelOrder();
        newAVL.delete(5);
        System.out.println();
        newAVL.levelOrder();
        System.out.println();
        newAVL.CompleteDelete();
    }
}
