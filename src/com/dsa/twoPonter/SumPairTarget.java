package com.dsa.twoPonter;



//Given a sorted array arr (sorted in ascending order) and a target, find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.
//
//Illustration :
//
//Input: arr[] = [10, 20, 35, 50], target =70
//Output:  true
//Explanation : There is a pair (20, 50) with given target.
//
//Input: arr[] = [10, 20, 30], target =70
//Output :  false
//Explanation : There is no pair with sum 70
//
//Input: arr[] = [-8, 1, 4, 6, 10, 45], target = 16
//Output: true
//Explanation : There is a pair (6, 10) with given target.
public class SumPairTarget {

    public static boolean sumPairExists(int[] num,int target){
        int left = 0;
        int right = num.length -1 ;
        boolean sumExisted = false;
        while(left<=right){
            int sum = num[left] + num[right];
            if(sum == target){
                sumExisted =true;
                break;
            }
            if(sum > target){
                right--;
            }
            if(sum < target){
                left ++;
            }

        }
        return sumExisted;
    }

    public static void main(String[] args) {
        System.out.println(sumPairExists(new int[]{10, 20, 35, 50}, 70));
        System.out.println(sumPairExists(new int[]{10, 20, 30}, 70));
        System.out.println(sumPairExists(new int[]{-8, 1, 4, 6, 10, 45}, 16));
    }


}
