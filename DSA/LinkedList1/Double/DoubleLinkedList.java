package DSA.LinkedList1.Double;

public class DoubleLinkedList {

    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoubleNode Create(int nodeValue){
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert

    public void Insert(int location , int nodeValue){
        DoubleNode Node = new DoubleNode();
        Node.value = nodeValue;
        if(head == null){
            Create(nodeValue);
            return;
        }else if(location == 0){
            Node.prev = null;
            Node.next = head;
            head.prev = Node;
            head = Node;
        }else if(location >= size){
            Node.next = null;
            Node.prev = tail;
            tail.next = Node;
            tail =  Node;
        }else{
            DoubleNode tempNode = new DoubleNode();
            for(int i = 0 ; i < location-1 ; i++ ){
                tempNode = tempNode.next;
            }
            Node.next = tempNode.next;
            Node.prev = tempNode;
            Node.next.prev = Node;
            tempNode.next = Node;
        }
        size++;
    }

    //Traversal

    public void Traverse(){
        if(head != null){
            DoubleNode tempNode = head;
            for(int i = 0 ; i < size ; i++){
                System.out.print(tempNode.value);
                if(i != size-1 ){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("LinkedList Does Not Exist");
        }
        System.out.println("\n");
    }

    //Reverse Traverse

    public void ReverseTraverse(){
        if(head != null){
            DoubleNode tempNode = tail;
            for(int i = size-1 ; i>=0 ; i--){
                System.out.print(tempNode.value);
                if(i != 0){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        }else{
            System.out.println("LinkedList Does Not Exist");
        }
        System.out.println("\n");
    }

    //Search

    public boolean Search(int nodeValue){
        if(head != null ){
            DoubleNode tempNode = head;
            for( int i = 0 ; i < size ; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Found at index "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node Not Found");
        return false;
    }

    //Deletion

    public void Delete(int location){
        if(head == null){
            System.out.println("LinkedList Does Not Exist");
            return;
        }else if(location == 0){
            if(size == 1){
                head = null;
                tail = null;
            }
            head = head.next;
            head.prev = null;
            size--;
        }else if(location >= size){
            if(size == 1){
                head = null;
                tail = null;
            }
            tail = tail.prev;
            tail.next = null;
            size--;
        }else{
            DoubleNode tempNode = head;
            for(int i = 0 ; i < location-1 ; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    //Delete Entire LinkedList

    public void CompleteDelete(){
        DoubleNode tempNode = head;
        for(int i = 0 ; i < size ; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("Linked List has been Deleted");
    }
    
}
