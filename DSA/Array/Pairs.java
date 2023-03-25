package DSA.Array;

import java.util.Scanner;

public class Pairs {

    static int[] arr = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Value");
        int trgt = sc.nextInt();

        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] + arr[j] == trgt){
                     System.out.println("("+arr[i]+","+arr[j]+")");
                    // return new int[] {i,j};
                }
            }
        }
    }
    
}
