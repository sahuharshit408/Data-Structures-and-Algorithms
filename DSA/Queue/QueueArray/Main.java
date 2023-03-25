package DSA.Queue.QueueArray;

public class Main {

    public static void main(String[] args) {
        
        QueueArray queue = new QueueArray(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        boolean result = queue.isFull();
        System.out.println(result);
        boolean result1 = queue.isEmpty();
        System.out.println(result1);
        int result2 = queue.deQueue();
        System.out.println(result2);
        int result3 = queue.peek();
        System.out.println(result3);
        queue.delete();
    }
    
}
