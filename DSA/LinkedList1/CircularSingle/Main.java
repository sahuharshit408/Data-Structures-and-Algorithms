package DSA.LinkedList1.CircularSingle;

public class Main {

    public static void main(String[] args) {
        
        CircularSingleLinkedList CSLL = new CircularSingleLinkedList();
        CSLL.Create(5);
        CSLL.Insert(1, 0);
        CSLL.Insert(2, 1);
        CSLL.Insert(3, 2);
        CSLL.Insert(4, 3);
        CSLL.Insert(5, 4);
        CSLL.Traversal();
        CSLL.Search(4);
        CSLL.Delete(3);
        CSLL.Traversal();
        CSLL.DeleteCompletely();
        CSLL.Traversal();

        //System.out.println(CSLL.head.value);
        //System.out.println(CSLL.head.next.value);
    }
    
}
