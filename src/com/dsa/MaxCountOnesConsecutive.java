package com.dsa;


// 485. Max Consecutive Ones
// Given a binary array nums, return the maximum number of consecutive 1's in the array.
//// Example 1:
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//// Example 2:
// Input: nums = [1,0,1,1,0,1]
// Output: 2
// Constraints:
// 1 <= nums.length <= 10^5
// nums[i] is either 0 or 1.
public class MaxCountOnesConsecutive {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i : nums) {
            if (i == 1) {

                count++;
            } else {
                count = 0;
            }

            if (maxCount < count) {
                maxCount = count;
            }

        }

        return maxCount;


    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
        int nums2[] = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}
