package DSA.Stack.LinkedList;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        boolean result = stack.isEmpty();
        System.out.println(result);

        int result1 = stack.pop();
        System.out.println(result1);

        int result2 = stack.peek();
        System.out.println(result2);

        stack.Delete();
    } 
}
