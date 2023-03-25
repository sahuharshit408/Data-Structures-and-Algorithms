package DSA.Queue.QueueLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList QLL = new QueueLinkedList();
        QLL.enQueue(1);
        QLL.enQueue(2);
        QLL.enQueue(3);
        QLL.enQueue(4);
        QLL.enQueue(5);
        boolean result = QLL.isEmpty();
        System.out.println(result);
        int result1 = QLL.deQueue();
        System.out.println(result1);
        int result2 = QLL.peek();
        System.out.println(result2);
        QLL.deleteQueue();
    }    
}
