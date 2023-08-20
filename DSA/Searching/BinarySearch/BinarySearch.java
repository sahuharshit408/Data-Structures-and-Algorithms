package DSA.Searching.BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr , int value){
        int start = 0;
        int end = arr.length-1;
        int middle = (start+end)/2;
        System.out.println(start+ " " +middle+ " " +end);
        while (arr[middle] != value){
            if (value < arr[middle]){
                end = middle-1;
            }else {
                start = middle+1;
            }
            middle = (start + end) / 2;
            System.out.println(start+ " " +middle+ " " +end);
        }
        if (arr[middle] == value){
            System.out.println(value+" Found at index "+middle);
            return middle;
        }else {
            System.out.println(value+ " not Found");
            return -1;
        }
    }

}
