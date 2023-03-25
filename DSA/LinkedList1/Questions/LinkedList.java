package DSA.LinkedList1.Questions;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public void Create(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    public void Insert(int nodeValue){
        if(head == null){
            Create(nodeValue);
            return;
        }
        
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void Traverse(){
        Node tempNode = head;
        for(int i = 0 ; i < size ; i++){
            System.out.print(tempNode.value);
            if( i != size-1){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }




    
}
