package DSA.LinkedList1.Questions;

import java.util.HashSet;

public class RemoveDuplicates {

    public void removeDups(LinkedList ll){
        HashSet<Integer> hs = new HashSet<Integer>();
        Node tempNode = ll.head;
        Node prev = null;
        while(tempNode != null){
            int value = tempNode.value;
            if(hs.contains(value)){
                prev.next = tempNode.next;
                ll.size--;
            }else{
                hs.add(value);
                prev = tempNode;
            }
            tempNode = tempNode.next; 
        }
    }
    
}
