package DSA.LinkedList1.CircularDouble;

public class CircularDoubleLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    // create

    public DoubleNode Create(int nodeValue){
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;
        node.prev = head;
        node.next = head;
        head = node;
        tail = node;
        size = 1; 
        return head;
    }

    //Insertion

    public void Insert(int nodeValue , int location){
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;
        if(head == null){
            Create(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head.prev = node;
            head = node;
        }else if(location >= size){
            node.prev = tail;
            node.next = head;
            tail.next = node;
            head.prev = node;
            tail = node;
        }else{
            DoubleNode tempNode = head;
            for(int i = 0 ; i < location-1 ; i++){
                tempNode = tempNode.next;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            tempNode.next.prev = node;
        }
        size++;
    }

    //Traversal

    public void Traversal(){
        if(head != null){
            DoubleNode tempNode = head;
            for(int i = 0 ; i < size ; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("LinkedList Does Not Exist");
        }
        System.out.println("\n");
    }
    
    //Reverse Traversal

    public void ReverseTraversal(){
        if(head != null){
            DoubleNode tempNode = tail;
            for(int i = 0 ; i < size ; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
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
        if(head != null){
            DoubleNode tempNode = head;
            for(int i = 0 ; i < size ; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Node Found at index "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
            System.out.println("LinkedList Does Not Exist");
            return false;
    }

    //Delete

    public void Delete(int location){
        if(head == null){
            System.out.println("LinkedList Does Not Exist");
            return;
        }else if(location == 0){
            if(size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            }else{
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        }else if(location >= size){
            if(size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            }else{
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
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

    // Delete Entire LinkedList

    public void CompleteDelete(){
        DoubleNode tempNode = head;
        for(int i = 0 ; i < size ; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null ;
        tail = null;
        System.out.println("Successfully Deleted");
    }
}
