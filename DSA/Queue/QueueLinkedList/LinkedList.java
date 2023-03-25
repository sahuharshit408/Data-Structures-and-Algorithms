package DSA.Queue.QueueLinkedList;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue){

        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    //Insert 

    public void Insert(int nodeValue , int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head == null){
            createSingleLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Traverse

    public void Traversal(){
        if(head == null){
            System.out.println("LinkedList does not Exist");
        }else{
            Node tempNode = head;
            for(int i = 0 ; i < size ; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> "); 
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");

    }

    //Search

    boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i = 0; i<size ; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Node Found at Location "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not Found");
        return false;
    }

    //Delete

    public void Delete(int location){

        if(head == null){
            System.out.println("LinkedList Does Not Exist");
            return;
        }else if(location == 0 ){
            head = head.next;
            size--;
            if(size == 0){
                head = null;
                tail = null;
            }
        }else if(location >= size){
            Node tempNode = head;
            for(int i = 0 ; i < size-1 ; i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for(int i=0 ; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}

    
