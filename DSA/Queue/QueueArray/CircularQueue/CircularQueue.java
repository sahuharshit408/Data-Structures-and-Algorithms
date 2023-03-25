package DSA.Queue.QueueArray.CircularQueue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        beginningOfQueue = -1;
        topOfQueue = -1;
        System.out.println("Circular Queue is Successfully Created with size "+size);
    }

    public boolean isEmpty(){
        if(topOfQueue == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfQueue + 1 == beginningOfQueue){
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("The circular Queue is Full");
        }else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" in the Queue");
        }else{
            if(topOfQueue == size-1){
                topOfQueue = 0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+value+" in the Queue");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Circular Queue is Empty ");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }else if(beginningOfQueue == size-1){
                beginningOfQueue = 0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("The Circular Queue is Empty");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }

    public void delete(){
        arr = null;
        System.out.println("Circular Queue Successfully Deleted");
    }
    
}
