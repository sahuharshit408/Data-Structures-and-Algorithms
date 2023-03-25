package DSA.Recursion;

import java.util.Scanner;

public class digitSum {
   

    public static int sum(int num){
        // int rem,n,add = 0;
        // // if(num%10==0){
        // //     while(num%10 == 0){
        // //         num = num%10;
        // //     }
        // //     add = add+num;
            
        // if(num%10==0){
        //     // num = num/10;
        //     // add = add+num;
           
        //         num=num/10;
        //     add+=sum(num);
        // }else{
        //     rem = num%10;
        //    // n = num - rem;
        //     num = num/10;
        //     add += rem + sum(num);
        // }
        // return add;
        if(num==0){
            return 0;
        }
        return num%10 +sum(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");

        int num = sc.nextInt();

        System.out.println("Summation of digits of "+num+" = "+sum(num));
    }
    
}
