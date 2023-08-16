package DSA.Hashing.QuadraticProbing;

import java.util.ArrayList;
import java.util.Hashtable;

public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    QuadraticProbing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCII(String word , int M){
        char ch[];
        ch = word.toCharArray();
        int sum = 0;
        for (int i = 0 ; i < word.length() ; i++){
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor(){
        double loadFactor = usedCellNumber * 1.0/hashTable.length;
        return loadFactor;
    }

    public void rehash(String word){
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable){
            if (s != null)  {
                data.add(s);
            }
        }
        data.add(word);
        hashTable = new String[hashTable.length * 2];
        for (String s : data){
            insert(s);
        }
    }

    public void insert(String word){
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75){
            rehash(word);
        }else {
            int index = modASCII(word , hashTable.length);
            int counter = 0;
            for (int i = index ; i < index+hashTable.length ; i++){
                int newIndex = (index + (counter * counter)) % hashTable.length;
                if (hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println(word+ " has been inserted");
                    break;
                }else {
                    System.out.println(newIndex+ " is already occupied");
                }
                counter++;
            }
        }
        usedCellNumber++;
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
    }

    public boolean search(String word){
        int index = modASCII(word , hashTable.length);
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
        int index = modASCII(word , hashTable.length);
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
