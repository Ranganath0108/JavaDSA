package com.dsa;

/*You are given an array arr[]. Your task is to count the number of even and odd elements. Return first odd count then even count.

        Examples:

Input: arr = [2, 3, 4, 5, 6]
Output: 2 3
Explanation: There are two odds[3, 5] and three even[2, 4, 6] present in the array.

Input: arr = [22, 32, 42, 52, 62]
Output: 0 5
Explanation: All the elements are even.*/

public class CountEvenOrOdd {

    public static int[] countEvenOdd(int[] arr){
        int oddCounter = 0 ;
        int evenCounter = 0;

        for(int i=0 ; i < arr.length; i++)
            if (arr[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
         return new int[] {oddCounter,evenCounter};
    }

    public static void main(String[] args) {
         int[] input2 = {22, 32, 42, 52, 62};
         int[] input1 = {2, 3, 4, 5, 6};
         int[] ans1 = countEvenOdd(input1);
         int[] ans2 = countEvenOdd(input2);
        System.out.println(ans1[0]+"  "+ans1[1]);
        System.out.println(ans2[0]+"  "+ans2[1]);


    }
}
