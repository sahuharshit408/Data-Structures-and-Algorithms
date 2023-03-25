package DSA.Recursion;

import java.util.Scanner;

public class power {

    public static int pow(int num,int p){
        if(p==1 || p==0){
            return num;
        }
        return num * pow(num,--p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int  num = sc.nextInt();
        System.out.println("Enter power");
        int p = sc.nextInt();
        System.out.println(num+" to the power of "+p+" = "+pow(num,p));
    }
    
}
