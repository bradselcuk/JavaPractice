package JAVA.LESSONS;

import java.util.ArrayList;
import java.util.Arrays;

public class Day_4_ArrayList {
    public static void main(String[] args) {

        Integer [] arr = {1,2,3,4,8,9};
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(array1);
        array1.add (0, 23);
        array1.add(1,12);
        System.out.println(array1);
        array1.addAll(Arrays.asList(45,57,65));
        System.out.println(array1);
        array1.remove(Integer.parseInt("1"));
        System.out.println(array1);
        array1.remove(Integer.valueOf(65));
        System.out.println(array1);
        array1.remove(Integer.parseInt("4"));
        System.out.println(array1);
    }
}
