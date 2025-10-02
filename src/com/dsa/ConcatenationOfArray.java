package com.dsa;

//1929. Concatenation of Array

//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//
//
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
//
//Example 2:
//
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//        - ans = [1,3,2,1,1,3,2,1]

import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[2*n];
        int c = 1;

        for (int i = 0; i < nums.length; i++) {
            newarr[i] = nums[i];
            newarr[i+n] = nums[i];
        }
        return newarr;

    }

    public static int[] getOptConcatenation(int[] nums) {

        int[] ans = new int[2*nums.length];
        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {1,2,1};
        int [] input2 = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(input1)));
        System.out.println(Arrays.toString(getConcatenation(input2)));
        System.out.println(Arrays.toString(getOptConcatenation(input1)));
        System.out.println(Arrays.toString(getOptConcatenation(input2)));
    }
}


