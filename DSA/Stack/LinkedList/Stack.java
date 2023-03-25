package DSA.Stack.LinkedList;

public class Stack {

    LinkedList linkedList;

    public Stack(){
        linkedList = new LinkedList();
    }
    
    //push 

    public void push(int value){
        linkedList.Insert(value, 0);
        System.out.println("Inserted value "+value+" in Stack");
    }

    //isEmpty
    
    public boolean isEmpty(){
        if(linkedList.head == null){
            return true;
        }else{
            return false;
        }
    }

    //pop

    public int pop(){
        int result = -1;
        if(isEmpty()){
            System.out.println("The Stack is Empty");
        }else{
            result = linkedList.head.value;
            linkedList.Delete(0);
        }
        return result;
    }

    //peek

    public int peek(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }else{
            return linkedList.head.value;
        }
    }

    //delete

    public void Delete(){
        linkedList.head = null;
        System.out.println("Stack Successfully Deleted");
    }
}