package DSA.LinkedList1.Double;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.Create(1);
        System.out.println(DLL.head.value);
        DLL.Insert(1, 0);
        DLL.Insert(2, 1);
        DLL.Insert(3, 2);
        DLL.Insert(4, 3);
        DLL.Insert(5, 4);
        DLL.Traverse();
        DLL.ReverseTraverse();
        DLL.Search(2);
        DLL.Delete(2);
        DLL.Traverse();
        DLL.CompleteDelete();
        DLL.Traverse();
    }
    
}
