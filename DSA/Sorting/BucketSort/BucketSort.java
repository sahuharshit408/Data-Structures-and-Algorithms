package DSA.Sorting.BucketSort;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    int[] arr;

    public BucketSort(int[] arr){
        this.arr = arr;
    }

    public void print(){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void printBuckets(ArrayList<Integer>[] buckets){
        for (int i = 0 ; i < buckets.length ; i++){
            System.out.println("\nBucket " +i+ ":");
            for (int j = 0 ; j < buckets[i].size() ; j++){
                System.out.println(buckets[i].get(j)+ " ");
            }
        }
    }

    public void bucketSort(){

        //Calculating Number of Buckets
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr){
            if (value > maxValue){
                maxValue = value;
            }
        }

        //Creating different Buckets
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0 ; i < buckets.length ; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        //Calculating appropriate Bucket number for each value
        for (int value : arr){
            int bucketNumber = (int)Math.ceil(((float)value * numberOfBuckets)/(float)maxValue);
            buckets[bucketNumber-1].add(value);
        }

        System.out.println("\n\nBuckets Before Sorting");
        printBuckets(buckets);

        //Sorting values in each bucket in set of buckets
        for (ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
        }

        System.out.println("\n\nBuckets After Sorting");
        printBuckets(buckets);

        //combining all sorted elements of individual buckets to a single array
        int index = 0;
        for (ArrayList<Integer> bucket: buckets){
            for (int value : bucket){
                arr[index] = value;
                index++;
            }
        }
    }

}
