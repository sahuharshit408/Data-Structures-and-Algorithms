package DSA.Sorting.HeapSort;

public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr){
        this.arr = arr;
    }

    public void heapSort(){
        BinaryHeap binaryHeap = new BinaryHeap(arr.length);
        for (int i = 0 ; i < arr.length ; i++){
            binaryHeap.insert(arr[i]);
        }

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = binaryHeap.extractHeadOfHeap();
        }
    }

    public void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
