package DSA.Array;

public class isUnique {

    static int[] arr = {2,5,6,3,9,9,8};
    
    public static boolean Unique(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
              if(arr[i] == arr[j]){
                return false;
              }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = Unique(arr);
        System.out.println("Is Unique = "+result);
    }
}
