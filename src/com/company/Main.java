package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = {1,2,3,3,3,4,5,2};

        System.out.println(majorityInArray(array));
    }

    //This should run at O(n) since it runs through the array only once.
    public static int majorityInArray(int [] array){
        HashMap<Integer, Integer> valueMap = new HashMap<Integer,Integer>();

        int count = 0;
        int biggerVal = 0;
        for(int num : array){
            valueMap.put(num,valueMap.get(num) == null ? 1 : valueMap.get(num)+1);
            if(valueMap.get(num)>count){
                count = valueMap.get(num);
                biggerVal = num;
            }
        }
        if(count > array.length/2){
            return biggerVal;
        } else
        return -1;
    }
}
