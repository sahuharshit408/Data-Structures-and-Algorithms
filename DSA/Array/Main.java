package DSA.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        // SingleDimensionalArray sda = new SingleDimensionalArray(3);
        // sda.insert(0, 10);
        // sda.insert(1, 20);
        // sda.insert(2, 30);

        // int[][] i2DArray;

        // i2DArray = new int[2][2];

        // i2DArray[0][0] = 1;
        // i2DArray[0][1] = 2;
        // i2DArray[1][0] = 3;
        // i2DArray[1][1] = 4;

        // System.out.println(Arrays.deepToString(i2DArray));

        // String s2DArray[][] = {{"a","b"},{"c","d"}};

        // System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionalArray obj = new TwoDimensionalArray(3, 3);
        obj.insertValueInTheArray(2, 2, 10);
        System.out.println(Arrays.deepToString(obj.arr));

    }
    
}
