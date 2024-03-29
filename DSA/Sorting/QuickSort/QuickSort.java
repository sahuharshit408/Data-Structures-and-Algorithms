package DSA.Sorting.QuickSort;

public class QuickSort {

    public int partition(int[] array , int start , int end){
        int pivot = end;
        int i = start -1;
        for (int j = start ; j <= end ; j++){
            if (array[j] <= array[pivot]){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }

    public void quickSort(int[] array , int start , int end){
        if (start < end){
            int pivot = partition(array , start , end);
            quickSort(array , start , pivot-1);
            quickSort(array , pivot+1 , end);
        }
    }

    public void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
