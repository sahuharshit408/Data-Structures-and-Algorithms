package DSA.LinkedList1.Questions;

public class SumLists {

    LinkedList sumList(LinkedList llA , LinkedList llB){
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        LinkedList ResultLL = new LinkedList();
        while(n1 != null || n2 != null){
            int result = carry;
            if(n1 != null){
                result += n1.value;
                n1 = n1.next;
            }
            if(n2 != null){
                result += n2.value;
                n2 = n2.next;
            }
            ResultLL.Insert(result%10);
            carry = result/10;
        }
        return ResultLL;
    }
    
}
