package DSA.Stack;

public class Main {
    public static void main(String[] args) {
    Stack stack = new Stack(4);
    // boolean result = stack.isEmpty();
    // System.out.println(result);
    // boolean result1 = stack.isFull();
    // System.out.println(result1);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    int result = stack.pop();
    System.out.println(result);
    int result1 = stack.pop();
    System.out.println(result1);
    int result3 = stack.peek();
    System.out.println(result3);

    stack.deleteStack();
    int result4 = stack.pop();
    System.out.println(result4);
    }
}
