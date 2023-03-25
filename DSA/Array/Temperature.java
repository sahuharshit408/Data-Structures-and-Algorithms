package DSA.Array;

import java.util.Scanner;

public class Temperature {
    static int[] temp = null;


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of Days");
    int n = sc.nextInt();
    temp = new int[n];

    int t = 0;

    for(int i = 0 ; i<n ; i++){
        System.out.println("Day "+(i+1)+" High Temperature");
        temp[i] = sc.nextInt();
        t=t+temp[i];
    }

    
    double AverageTemp = t/n;

    System.out.println("Average Temperature = "+AverageTemp);

    int count = 0;

    for(int i = 0 ; i<temp.length ; i++){
        if(temp[i]>AverageTemp)
        count++;
    }

    System.out.println(+count+ " Days Above Average");

}
}