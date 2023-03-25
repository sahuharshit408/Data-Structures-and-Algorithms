package DSA.Recursion;

import java.util.Scanner;

public class Main {
    public static int s;

    public static int fact(int n){

       // int s;
        if(n==1){
            return 1;
        }else{
            s=n*fact(n-1);
        }
         return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        fact(num);
        System.out.println("Factorial = "+s);
    }
    
}
