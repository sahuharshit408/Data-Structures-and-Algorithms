package DSA.Sorting.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10 , 3, 2, 5, 8, 4, 1 ,6, 7, 9};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr , 0 , arr.length-1);
        qs.print(arr);
    }
}
