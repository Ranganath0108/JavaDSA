package com.dsa.twoPonter;


//Squares of a Sorted Array
//
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
//
//Example 2:
//
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
//
//
//
//Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//nums is sorted in non-decreasing order.
//
//
//Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?

public class SquareOfSortedArray {


    public static int[] sortedArrays(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] input1 = {-4, -1, 0, 3, 10};
        int[] input2 = {-7, -3, 2, 3, 11};
        int[] result1 = sortedArrays(input1);
        int[] result2 = sortedArrays(input2);
        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
    }
}
