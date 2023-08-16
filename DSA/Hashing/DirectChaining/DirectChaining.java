package DSA.Hashing.DirectChaining;

import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    //Hash Function
    public int modASCII(String word , int M){
        char ch[];
        ch = word.toCharArray();
        int sum = 0;
        for (int i = 0 ; i < word.length() ; i++){
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void insert(String word){
        int newIndex = modASCII(word , hashTable.length);
        if (hashTable[newIndex] == null){
            hashTable[newIndex] = new LinkedList<>();
            hashTable[newIndex].add(word);
        }else {
            hashTable[newIndex].add(word);
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
    }

    public boolean search(String word){
        int index = modASCII(word , hashTable.length);
        if (hashTable[index] != null && hashTable[index].contains(word)){
            System.out.println(word+ " Found at index " +index);
            return true;
        }else {
            System.out.println(word+ " not Found");
            return false;
        }
    }

    public void delete(String word){
        int index = modASCII(word , hashTable.length);
        boolean found = search(word);
        if (found == true){
            hashTable[index].remove(word);
            System.out.println(word+ " deleted from HashTable");
        }else {
            System.out.println(word+ " not found");
        }
    }

}
