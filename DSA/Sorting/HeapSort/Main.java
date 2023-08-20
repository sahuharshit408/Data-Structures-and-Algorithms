package DSA.Sorting.HeapSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10 , 3, 2, 5, 8, 4, 1 ,6, 7, 9};
        HeapSort hs = new HeapSort(arr);
        hs.heapSort();
        hs.print(arr);
    }
}
