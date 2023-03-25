package DSA.LinkedList1.Questions;

public class NthFromLast {
    
    public Node NthLast(LinkedList ll , int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i = 0 ; i < n ; i++){
            if(p2 == null) return null;
            p2 = p2.next;
        }
        // for(int i = 0 ; i < ll.size-1 ; i++){
        //     p1 = p1.next;
        //     p2 = p2.next;
        // }
        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println(p1.value);
        return p1;
    }
}
