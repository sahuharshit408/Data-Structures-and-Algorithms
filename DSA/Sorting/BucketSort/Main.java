package DSA.Sorting.BucketSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10 , 3, 2, 5, 8, 4, 1 ,6, 7, 9};
        BucketSort bs = new BucketSort(arr);
        bs.print();
        bs.bucketSort();
        bs.print();
    }
}
