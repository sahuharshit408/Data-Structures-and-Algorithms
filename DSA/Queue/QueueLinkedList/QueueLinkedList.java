package DSA.Queue.QueueLinkedList;

public class QueueLinkedList {

    LinkedList list;

    public QueueLinkedList(){
        this.list = new LinkedList();
        System.out.println("Queue Successfully Created");
    }

    public boolean isEmpty(){
        if(list.head == null){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){
        list.Insert(value, list.size);
        System.out.println("Successfully Inserted "+value+" in the Queue");
    }

    public int deQueue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }else{
            value = list.head.value;
            list.Delete(0);
        }
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }else{
            return list.head.value;
        }
    }

    public void deleteQueue(){
        list.head = null;
        list.tail = null;
        System.out.println("Queue Successfully Deleted");
    }
}
