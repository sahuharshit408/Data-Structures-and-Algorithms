package DSA.Sorting.SelectionSort;

public class SelectionSort {

    public void selectionSort(int[] arr){
        for (int j = 0 ; j < arr.length ; j++){
            int minIndex = j;
            for (int i = j+1 ; i < arr.length ; i++){
                if (arr[i] < arr[minIndex]){
                    minIndex = i;
                }
            }
            if (minIndex != j){
                int temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

   public void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
