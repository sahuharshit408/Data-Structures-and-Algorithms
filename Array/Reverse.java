package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    public static Scanner sc = new Scanner(System.in);

    private static void reverse(int[] array,int[] revArray){

        // int maxindex = array.length - 1;
        // int halflength = array.length /2;

        

        System.out.println("Original Array : "+Arrays.toString(array));
        
        // for(int i=0;i<n;i++){
        //     revArray[i] = array[n-1-i];
        //     //System.out.print(+array[i]+"  ");
        // }

        System.out.println("Reversed Array : "+Arrays.toString(revArray));
        // for(int i=0;i<n;i++){
           
        //     System.out.print(+revArray[i]+"  ");
        // }

    }


    public static void main(String[] args){

        System.out.println("Enter no of elements");
        int n= sc.nextInt();

        int[] array = new int[n];
        int[] revArray = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
            revArray[n-1-i] = array[i];
        }
        reverse(array,revArray);
    }
    
}
