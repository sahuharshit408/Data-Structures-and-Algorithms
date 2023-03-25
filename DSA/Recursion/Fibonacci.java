package DSA.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int s;


    public static int Fib(int n){
        if(n == 0  || n == 1){
            return n;
        }
           return Fib(n-1) + Fib(n-2);
           
       // System.out.print(s+" ");

       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        // Fib(n);
        // Fibonacci fib = new Fibonacci();
        // var res = fib.Fib(n);
        // System.out.println(res+" ");

        for(int i =0; i<=n;i++){
            System.out.print(Fib(i)+" ");
        }
        
    }
    
}
