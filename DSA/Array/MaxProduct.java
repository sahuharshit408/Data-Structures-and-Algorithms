package DSA.Array;

public class MaxProduct {

    static int[] arr = {2,5,6,3,7,9,8};
    public static void main(String[] args) {
        int MaxProduct = 0;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
               int temp = arr[i] * arr[j];
               if(temp>MaxProduct)
               MaxProduct = temp;
            }
        }
        System.out.println("Maximum Product = "+MaxProduct);
    }
    
}
