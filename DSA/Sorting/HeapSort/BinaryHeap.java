package DSA.Sorting.HeapSort;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size){
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Heap has been Created");
    }

    public int sizeOfArray(){
        return arr.length;
    }

    public int sizeOfTree(){
        System.out.println("Size of Tree " +sizeOfTree);
        return sizeOfTree;
    }

    public boolean isEmpty(){
        if (sizeOfTree == 0){
            return true;
        }else {
            return false;
        }
    }

    public void deleteHeap(){
        arr = null;
        System.out.println("Heap hs been Deleted");
    }

    public void insert(int value){
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree);
        System.out.println("Inserted "+value+" in Heap");
        levelOrder();
    }

    public Integer peek(){
        if (isEmpty()){
            System.out.println("Heap is Empty");
            return null;
        }
        return arr[1];
    }

    public int extractHeadOfHeap(){
        if (sizeOfTree == 0){
            System.out.println("Heap is Empty");
            return -1;
        }else {
            System.out.println("Head of Heap is "+arr[1]);
            System.out.println("Extracting Head of Heap");
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1);
            levelOrder();
            return extractedValue;
        }
    }

    public void levelOrder(){
        for (int i = 1; i<=sizeOfTree ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapifyBottomToTop(int index) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (arr[index] < arr[parent]) {
            int tmp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = tmp;
        }
        heapifyBottomToTop(parent);
    }

    public void heapifyTopToBottom(int index){
        int left  = index*2;
        int right = (index*2)+1;
        int smallestChild = 0;

        if (sizeOfTree < left){
            return;
        } else if (sizeOfTree == left) {
            if (arr[index] > arr[left]){
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
            }
            return;
        }else {
            if (arr[left] < arr[right]){
                smallestChild = left;
            }else {
                smallestChild = right;
            }
            if (arr[index] > arr[smallestChild]){
                int temp = arr[index];
                arr[index] = arr[smallestChild];
                arr[smallestChild] = temp;
            }
        }
        heapifyTopToBottom(smallestChild);
    }

}
