package DSA.Recursion;

import java.util.Scanner;

public class gcd {

    public static int hcf(int a , int b){
        if(a<0||b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        hcf(a,b);
        System.out.println("HCF of "+a+" and "+b+" is "+hcf(a, b));
    }
    
}
