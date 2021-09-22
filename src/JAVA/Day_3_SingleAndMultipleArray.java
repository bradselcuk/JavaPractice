package JAVA;

import java.util.Arrays;

public class Day_3_SingleAndMultipleArray {
    public static void main(String[] args) {

        //Single Array #1 way
        int[]arr = {6,7,9,2,1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //Single Array #2 way
        int[]arr1 = {6,7,9,2,1,2,3,4,5};
        for(int each:arr1){
            System.out.print(each+" ");
        }
        System.out.println(" ");
        System.out.print(arr1[0]);
        System.out.println(" ");
        System.out.print(arr1[4]);
        System.out.println(" ");
        System.out.println(arr.length);
        System.out.println();
        Arrays.sort(arr1);
        for(int each1:arr1){
            System.out.print(each1+" ");
        }
        System.out.println();
        // Multiple Array
        int [] [] arr3 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(arr3.length);
        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(arr3[1][0]);

        int [][] arr4 = {{1,2,3},{4,5,6}};
        for(int [] each:arr4){
            for(int each1:each){
                System.out.print(each1);
            }
        }
        System.out.println();
        int[][][]arr2={{{1,2},{3,4}},{{5,6},{7,8}}};
        System.out.println(Arrays.deepToString(arr2));

        System.out.println();

        for(int[][] each:arr2){
            for(int[] each1:each){
                for(int each2:each1){
                    System.out.print(each2+"  ");
                }
            }
        }

    }
}
