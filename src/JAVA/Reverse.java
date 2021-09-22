package JAVA;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        //Reverse

        String name = "Bulent";
        StringBuilder rev = new StringBuilder(name);
        System.out.println(rev.reverse());
        //
        int num = 12345;
        int reverse = 0;

        while(num !=0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num =num /10;
        }
        System.out.println(reverse);
        //
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index = 0;
        while(index <arr.length){
            System.out.print(arr[index]);
            index++;
        }
        System.out.println();
        int [] arr2 = {1,2,3,4,5,6,7,8,9};
        int index2 = arr2.length-1;
        while(index2>=0){
            System.out.print(arr2[index2]);
            index2--;
        }


        }

    }

