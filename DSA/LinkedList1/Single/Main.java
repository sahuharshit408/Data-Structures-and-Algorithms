package DSA.LinkedList1.Single;

public class Main {

    public static void main(String[] args) {
        
        SingleLinkedList SLL = new SingleLinkedList();
        SLL.createSingleLinkedList(5);
       // System.out.println(SLL.head.value);
        SLL.Insert(6, 1);
        SLL.Insert(7, 3);
        SLL.Insert(8, 4);
        SLL.Insert(9, 5);
        SLL.Insert(10, 6);

        SLL.Traversal();

        SLL.searchNode(7);
        SLL.Delete(4);

        SLL.Traversal();

        SLL.DeleteCompletely();

        SLL.Traversal();




       // System.out.println(SLL.head.next.value);

    }
    
}
