package DSA.Sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {10 , 3, 2, 5, 8, 4, 1 ,6, 7, 9};
        is.insertionSort(arr);
        is.print(arr);
    }
}
