package DSA.LinkedList1.Questions;

public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.Create(1);
        ll.Insert(2);
        ll.Insert(3);
        ll.Insert(2);
        ll.Insert(5);
        ll.Insert(6);    
        ll.Traverse();

        // RemoveDuplicates remDups = new RemoveDuplicates();
        // remDups.removeDups(ll);

        // ll.Traverse();

        NthFromLast Nth = new NthFromLast();
        Nth.NthLast(ll, 3);

        PartitionAroundX partition = new PartitionAroundX();
        LinkedList newLinkedList =  partition.Partition(ll, 3);
        newLinkedList.Traverse();

                System.out.println("Sum of Lists");

        LinkedList llA = new LinkedList();
        llA.Insert(7);
        llA.Insert(1);
        llA.Insert(6);
        llA.Traverse();

        LinkedList llB = new LinkedList();
        llB.Insert(5);
        llB.Insert(9);
        llB.Insert(2);
        llB.Traverse();


        SumLists SL = new SumLists();
        LinkedList result = SL.sumList(llA, llB);
        result.Traverse();
        
        LinkedList llA1 = new LinkedList();
        llA1.Insert(3);
        llA1.Insert(1);
        llA1.Insert(5);
        llA1.Insert(9);

        LinkedList llB1 = new LinkedList();
        llB1.Insert(2);
        llB1.Insert(4);
        llB1.Insert(6);

        Intersection intersection = new Intersection();
        intersection.addSameNode(llA1, llB1, 7);
        intersection.addSameNode(llA1, llB1, 2);
        intersection.addSameNode(llA1, llB1, 1);

        Node intersect = intersection.findIntersection(llA1, llB1);
        System.out.println(intersect.value);
    }
    
}
