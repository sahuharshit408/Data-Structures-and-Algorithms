package DSA.Array;

public class SingleDimensionalArray {

    int[] arr = null;

    public SingleDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location , int valueToBeInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            }else{
                System.out.println("This Cell is Already Occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
       
    }

    public void traverseArray(){
        try{
            for(int i = 0; i<=arr.length; i++){
                System.out.println(arr[i] +" ");
            }
        }catch(Exception e){
            System.out.println("Array no Longer Exists");
        }
    }

    public void searchInArray(int valueToSearch){
        for(int i = 0 ; i<=arr.length ; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value id found at index of " +i);
                return;
            }
        }
        System.out.println(valueToSearch+ " is not found");
    }

    
}
