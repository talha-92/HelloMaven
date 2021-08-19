package com.graviton;

import java.util.Arrays;

public class LargestArray {
    public static void main(String args[]) {
        int[] myArray = {20, 50, 60, 2};
        int largestNumber = myArray[0];
        for (int i= 1; i <myArray.length;i++){
            if(myArray[i]>largestNumber){
                largestNumber = myArray[i];
            }
        }
        System.out.println(largestNumber);



    }
}
