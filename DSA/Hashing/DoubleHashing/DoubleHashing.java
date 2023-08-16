package DSA.Hashing.DoubleHashing;

import java.util.ArrayList;

public class DoubleHashing {

    String[] hashTable;
    int usedCellNumber;

    DoubleHashing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int FirstHashFunction(String word , int M){
        char ch[];
        ch = word.toCharArray();
        int sum = 0;
        for (int i = 0 ; i < word.length() ; i++){
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void rehash(String newStringToBeInserted){
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable){
            if (s != null)  {
                data.add(s);
            }
        }
        data.add(newStringToBeInserted);
        hashTable = new String[hashTable.length * 2];
        for (String s : data){
            insert(s);
        }
    }

    public void display(){
        if (hashTable == null){
            System.out.println("\nHashTable does not Exist");
        }else {
            System.out.println("\n---------HashTable---------");
            for (int i = 0 ; i < hashTable.length ; i++){
                System.out.println("Index " +i+ " , Key:- " +hashTable[i]);
            }
        }
        System.out.println("\n");
    }

    private int AllDigitSum(int sum){
        int value = 0 ;
        while (sum > 0 ){
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    public int SecondHashFunction(String x , int M){
        char ch[];
        ch = x.toCharArray();
        int sum = 0;
        for (int i = 0 ; i < x.length() ; i++){
            sum += ch[i];
        }
        while (sum > hashTable.length){
            sum = AllDigitSum(sum);
        }
        return sum % M;
    }

    public double getLoadFactor(){
        return usedCellNumber * 1.0/hashTable.length;
    }

    public void insert(String value){
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75){
            rehash(value);
        }else {
            int x = FirstHashFunction(value , hashTable.length);
            int y = SecondHashFunction(value , hashTable.length);
            for (int i = 0; i < hashTable.length ; i++){
                int newIndex = (x + i*y) % hashTable.length;
                if (hashTable[newIndex] == null){
                    hashTable[newIndex] = value;
                    System.out.println(value+ " inserted at "+newIndex);
                    break;
                }else {
                    System.out.println(newIndex+ " is already occupied");
                }
            }
        }
        usedCellNumber++;
    }

    public boolean search(String word){
        int index = SecondHashFunction(word , hashTable.length);
        for (int i = index; i < index+hashTable.length ; i++){
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                System.out.println(word+ " found at " +newIndex);
                return true;
            }
        }
        System.out.println(word+ " not found");
        return false;
    }

    public void delete(String word){
        int index = SecondHashFunction(word , hashTable.length);
        for (int i = index; i < index+hashTable.length ; i++){
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                hashTable[newIndex] = null;
                System.out.println(word+ " has been deleted");
                return;
            }
        }
        System.out.println(word+ " not found");
    }

}
