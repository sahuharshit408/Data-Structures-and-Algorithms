package DSA.LinkedList1.Questions;

public class PartitionAroundX {

    public LinkedList Partition(LinkedList ll , int x){
        Node tempNode = ll.head;
        ll.tail = ll.head;
        while(tempNode != null){
            Node nextNode = tempNode.next;
            if(tempNode.value < x){
                tempNode.next = ll.head;
                ll.head = tempNode;
            }else{
                ll.tail.next = tempNode;
                ll.tail = tempNode;
            }
            tempNode = nextNode;
        }
        ll.tail.next = null; 
        return ll;
    }
    
}
