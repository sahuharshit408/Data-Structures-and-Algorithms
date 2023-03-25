package DSA.Stack;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with size "+size);
    }

    // isEmpty

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }else{
            return false;
        }
    }

    // is Full

    public boolean isFull(){
        if(topOfStack == arr.length-1){
            System.out.println("The Stack is Full");
            return true;
        }else{
            return false;
        }
    }

    // push

    public void push(int value){
        if( isFull()){
            System.out.println("The Stack is Full");
        }else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The Value is Successfully Inserted");
        }
    }

    // pop

    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }else{
            int last = arr[topOfStack];
            topOfStack--;
            return last;
        }
    }

    // peek

    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is EMpty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    } 

    // Delete

    public void deleteStack(){
        arr = null;
        System.out.println("The Stack is Successfully Deleted");
    }
    
}
