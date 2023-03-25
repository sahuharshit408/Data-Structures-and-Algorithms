package DSA.LinkedList1.CircularDouble;

public class Main {

    public static void main(String[] args) {
        CircularDoubleLinkedList CDLL = new CircularDoubleLinkedList();
        CDLL.Create(0);
        //System.out.println(CDLL.head.value);
        CDLL.Insert(1, 1);
        CDLL.Insert(2, 2);
        CDLL.Insert(3, 3);
        CDLL.Insert(4, 4);
        CDLL.Insert(5, 5);
        CDLL.Traversal();
        CDLL.ReverseTraversal();
        CDLL.Search(4);
        CDLL.Delete(2);
        CDLL.Traversal();
        CDLL.CompleteDelete();
        CDLL.Traversal();
    }
    
}
