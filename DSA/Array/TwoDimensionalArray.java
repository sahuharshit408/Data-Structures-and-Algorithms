package DSA.Array;

public class TwoDimensionalArray {

    int[][] arr = null;

    public TwoDimensionalArray(int numberOfRows , int numberOfColumns){
        arr = new int[numberOfRows][numberOfColumns];
        for(int row = 0; row < arr.length ; row++){
            for(int col = 0 ; col < arr[0].length ; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInTheArray(int row , int col , int value ){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){

                arr[row][col] = value;
                System.out.println("The value is succcessfully inserted");
            }else{
                System.out.println("Cell is Already Occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");

        }
    }

    //Time Complexity O(1)
    //Space Complexity O(1)
    
}
