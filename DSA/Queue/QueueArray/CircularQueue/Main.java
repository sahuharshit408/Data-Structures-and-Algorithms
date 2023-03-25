package DSA.Queue.QueueArray.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue CQ = new CircularQueue(5);
        CQ.enQueue(1);
        CQ.enQueue(2);
        CQ.enQueue(3);
        CQ.enQueue(4);
        CQ.enQueue(5);
        boolean result = CQ.isEmpty();
        System.out.println(result);
        boolean result1 = CQ.isFull();
        System.out.println(result1);
        int result2 = CQ.deQueue();
        System.out.println(result2);
        int result3 = CQ.peek();
        System.out.println(result3);
        CQ.delete();
    }    
}
