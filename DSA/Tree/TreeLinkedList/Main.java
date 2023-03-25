package DSA.Tree.TreeLinkedList;

public class Main {

    public static void main(String[] args) {
        BinaryTreeLL BT = new BinaryTreeLL(); 

        BT.Insert("N1");
        BT.Insert("N2");
        BT.Insert("N3");
        BT.Insert("N4");
        BT.Insert("N5");
        BT.Insert("N6");
        BT.Insert("N7");
        BT.Insert("N8");
        BT.Insert("N9");

        BT.LevelOrder();
        System.out.print("\n");

        System.out.println(BT.getDeepestNode().value);

        BT.DeleteNode("N3");
        System.out.println();
        BT.LevelOrder();
        BT.DeleteTree();
        System.out.println();
        BT.LevelOrder();

        
        // BinaryNode N1 = new BinaryNode();
        // N1.value = "N1";
        // BinaryNode N2 = new BinaryNode();
        // N2.value = "N2";
        // BinaryNode N3 = new BinaryNode();
        // N3.value = "N3";
        // BinaryNode N4 = new BinaryNode();
        // N4.value = "N4";
        // BinaryNode N5 = new BinaryNode();
        // N5.value = "N5";
        // BinaryNode N6 = new BinaryNode();
        // N6.value = "N6";
        // BinaryNode N7 = new BinaryNode();
        // N7.value = "N7";
        // BinaryNode N8 = new BinaryNode();
        // N8.value = "N8";
        // BinaryNode N9 = new BinaryNode();
        // N9.value = "N9";

        // N1.left = N2;
        // N1.right = N3;
        // N2.left = N4;
        // N2.right = N5;
        // N3.left = N6;
        // N3.right = N7;
        // N4.left = N8;
        // N4.right = N9;
        // BT.root = N1;

        // BT.preOrder(BT.root);
        // System.out.println("\n");
        // BT.InOrder(BT.root);
        // System.out.println("\n");
        // BT.PostOrder(BT.root);
        // System.out.println("\n");
        // BT.LevelOrder();

       //BT.search("N1");

       


    }
    
}
