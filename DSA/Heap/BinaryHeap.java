package DSA.Heap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size){
        arr = new int[size];
        this.sizeOfTree = 0;
        System.out.println("Heap has been Created");
    }

    public boolean isEmpty(){
        if (sizeOfTree == 0){
            return true;
        }else {
            return false;
        }
    }

    public Integer peek(){
        if (isEmpty()){
            System.out.println("Heap is Empty");
            return null;
        }
        return arr[1];
    }

    public int sizeOfBP(){
        return sizeOfTree;
    }

    public void levelOrder(){
        for (int i = 1; i<=sizeOfTree ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapify(int index , String heapType){
        int parent = index / 2;
        if (index <= 1){
            return;
        }
        if (heapType == "Min"){
            if (arr[index] < arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapify(parent , heapType);
    }

    public void insert(int value , String typeHeap){
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapify(sizeOfTree , typeHeap);
        System.out.println("Inserted "+value+" in Heap");
    }
}
