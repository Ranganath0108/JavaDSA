package com.dsa.slidingWindow;


//Maximum Sum of a Subarray with K Elements
//Given an array arr[] and an integer k, we need to calculate the maximum sum of a subarray having size exactly k.
//
//        Input  : arr[] = [5, 2, -1, 0, 3], k = 3
//Output : 6
//Explanation : We get maximum sum by considering the subarray [5, 2 , -1]
//
//Input  : arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
//Output : 39
//Explanation : We get maximum sum by adding subarray [4, 2, 10, 23] of size 4.

import java.util.Arrays;

public class MaxSumKElementsSubArr {


    static int maxSumOfKElem(int[] arr , int k){
        int startIndex = 0 , endIndex = k,maxSum = 0 , sum = 0;
        while(endIndex < arr.length){
            int [] subarr = Arrays.copyOfRange(arr,startIndex,endIndex);
            sum = Arrays.stream(subarr).sum();
            maxSum = Math.max(sum,maxSum);
            startIndex++;
            endIndex++;
        }
        return maxSum;
    }


    public static void main(String[] args) {
        System.out.println(maxSumOfKElem(new int[]{5, 2, -1, 0, 3},3));
        System.out.println(maxSumOfKElem(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20},4));
    }
}
