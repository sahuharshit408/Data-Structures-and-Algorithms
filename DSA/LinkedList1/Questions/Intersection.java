package DSA.LinkedList1.Questions;

public class Intersection {
    
    Node getKthNode(Node head , int k){
        Node current = head;
        while(k>0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }

    Node findIntersection(LinkedList list1 , LinkedList list2){
        if(list1.head == null || list2.head == null){
            return null;
        }
        if(list1.tail != list2.tail){
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if(list1.size > list2.size){
            longer = list1.head;
            shorter = list2.head;
        }else{
            longer = list2.head;
            shorter = list1.head;
        }

        longer = getKthNode(longer, Math.abs(list1.size-list2.size));
        while(shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    void addSameNode(LinkedList llA1 , LinkedList llB1 , int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA1.tail.next = newNode;
        llA1.tail = newNode;
        llB1.tail.next = newNode;
        llB1.tail = newNode;
    }
}
