package DSA.LinkedList1.CircularSingle;

public class CircularSingleLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node Create(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insert

    public void Insert(int nodeValue , int location){
        Node node  = new Node();
        node.value = nodeValue;
        if(head == null){
            Create(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
            tail.next = node;
        }else if(location >= size){
            tail.next = node;
            tail = node;
            node.next = null;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            // Node nextNode = tempNode.next;
            // tempNode.next = node;
            // node.next = nextNode.next;

            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }


    //Traversal

    public void Traversal(){
        if(head == null){
            System.out.println("LinkedList Does Not Exist");
        }else{
            Node tempNode = head;
            for(int i =0 ; i < size ; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> "); 
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //Searching

    public boolean Search(int nodeValue){
        // if(head != null){
        //     Node tempNode = head;
        //     for(int i = 0 ; i < size ; i++){
        //         if(tempNode.value == nodeValue){
        //             System.out.println("Node Found at index "+i);
        //         }
        //         tempNode = tempNode.next;
        //     }
        //     System.out.println("Node Not Found");

        // }else{
        //     System.out.println("LinkedList Does Not Exist");
        // }

        if(head != null){
            Node tempNode = head;
            for(int i = 0 ; i < size ; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("Node Found at Index "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not Found");
        return false;

    }

    //Deletion

    public void Delete(int location){
        if(head == null){
            System.out.println("LinkedList Does Not Exist");
            return;
        }else if(location == 0){
            if(size == 0){
                tail = null;
                head.next = null;
                head = null;
                size--;
            }
            head = head.next;
            tail.next = head;
            size--;
           
        }else if(location >= size){
            Node tempNode = head;
            for(int i = 0 ; i < size-1 ; i++ ){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for(int i = 0; i < location-1 ; i++){
                tempNode = tempNode.next;
            }
            Node nextNode = tempNode.next;
            tempNode.next = nextNode.next;
            size--;
        }
    }

    //Delete Entire LinkedList

    public void DeleteCompletely(){
       if(head == null){
        System.out.println("LinkedList Does Not Exist");
       }else{
        head = null;
        tail.next = null; 
        tail = null;
       
        System.out.println("Succesfully deleted");
       }
    }
    
}
