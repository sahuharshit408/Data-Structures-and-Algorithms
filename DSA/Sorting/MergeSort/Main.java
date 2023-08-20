package DSA.Sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10 , 3, 2, 5, 8, 4, 1 ,6, 7, 9};
        MergeSort ms = new MergeSort();
        ms.print(arr);
        ms.mergeSort(arr , 0 , arr.length-1);
        ms.print(arr);
    }
}
