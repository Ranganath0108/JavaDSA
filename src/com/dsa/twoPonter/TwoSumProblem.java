package com.dsa.twoPonter;


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//        Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums ,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]== target){
                    return new int[]  {i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumOptimized(int[] sums ,int target){
        Map<Integer,Integer> numMap= new HashMap<>();;
        for (int i = 0; i < sums.length; i++) {
            int compliment = target - sums[i];
            if(numMap.containsKey(compliment)){
                return new int [] {numMap.get(compliment),i};
            }
            numMap.putIfAbsent(sums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        System.out.println("Brute Force Solution");
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println("Optimized Solution");
        System.out.println(Arrays.toString(twoSumOptimized(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumOptimized(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSumOptimized(new int[]{3, 3}, 6)));

    }
}
