package DSA.Array;

import java.util.Arrays;

public class RotateMatrix {

    static int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    
    public static void main(String[] args) {

        int n = arr.length;
       // System.out.println(Arrays.deepToString(arr));

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0 ; i<arr.length ; i++){
            int first = i;
            int last = n-1-i;
            for(int j = first ; j<last ; j++){
                int offset = j - first;
                int top = arr[first][j];
                arr[first][j] = arr[last - offset][first];
                arr[last - offset][first] = arr[last][last-offset];
                arr[last][last-offset] = arr[j][last];
                arr[j][last] = top;
            }
        }

        System.out.println("After 90 degrees Rotation");


        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       // System.out.println(Arrays.deepToString(arr));
    }
}


