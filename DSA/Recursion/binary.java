package DSA.Recursion;

import java.util.Scanner;

public class binary {

    public static int convert(int num){
        
        if(num == 0){
            return 0;
        }
        return num%2 + 10*convert(num/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println("Binary Equivalent of "+num+" is "+convert(num));
    }
    
}
