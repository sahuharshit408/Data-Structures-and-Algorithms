package Array;

import java.util.*;
public class Minimum{

    private static Scanner sc = new Scanner(System.in);
    //public static int count;
    //public static  int min;
    //public static int  x;




    public static int[] readIntegers(int count){

        int[] array = new int[count];
       // Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i = 0;i<array.length;i++){
            //array[i] = sc.nextInt();
           // return array[i];
           int number = sc.nextInt();
           //sc.nextLine();
           array[i] = number;
        }
        return array;
        
    }

    public static int findMin(int[] array){

        // min = array[0];
        // for(int i=1;i<array.length;i++){
        //     if(array[i]<min){
        //         min = array[i];
        //     }else{
        //         min = min;
        //     }
        // }

        // //int x = min;
    
        // return min;
        int min = Integer.MAX_VALUE;

        for(int i =0; i<array.length;i++){
            int value = array[i];

            if(value < min){
                min = value;
            }
        }

        return min; 

    }

    //public static int  PrintMin(int min){
    //     System.out.println("minimum value = "+min);

    //     return 0;
    // }

    public static void main(String[] args){

       
        System.out.println("Enter number of elements");
        int count = sc.nextInt();
        //readIntegers(count);
        sc.nextLine();
       // System.out.println("minimum value = "+x);
       //PrintMin( min);

       int [] returnedArray = readIntegers(count);
       int returnedMin = findMin(returnedArray);

       System.out.println("Min = "+returnedMin);
         

    }
}
