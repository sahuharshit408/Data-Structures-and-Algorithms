package DSA.Array;

public class Permutation {

    static int[] arr1 = {1,2,3,4,5,6};
    static int[] arr2 = {6,5,4,3,2,1};
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        int product1 = 1;
        int product2 = 1;

        if(arr1.length == arr2.length){

            for(int i = 0 ; i < arr1.length ; i++){
                sum1 = sum1 + arr1[i];
                product1 = product1 * arr1[i];
                sum2 = sum2 + arr2[i];
                product2 = product2 * arr2[i];
            }

            if(sum1 == sum2 && product1 == product2){
                System.out.println("It is a Permutation");
            }else{
                System.out.println("It is not a Permutation");
            }
        
        }else{
            System.out.println("It is not a Permutation");       
        }
    }
    
}
