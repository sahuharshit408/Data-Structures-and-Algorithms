package DSA.Searching.LinearSearch;

public class LinearSearch {

    public static int linearSearch(int[] arr , int value){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == value){
                System.out.println(value+" Found at index "+i);
                return i;
            }
        }
        System.out.println(value+ " not Found");
        return -1;
    }
}
