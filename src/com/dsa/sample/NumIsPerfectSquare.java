package com.dsa.sample;


//Given a number n, check if it is a perfect square or not.
//
//        Examples :
//
//Input  : n = 36
//Output : Yes
//
//Input : n = 2500
//Output : Yes
//Explanation: 2500 is a perfect square of 50
//
//Input  : n = 8
//Output : No

public class NumIsPerfectSquare {

    static String isPerfectSquare(int num) {
        if (num < 0) {
            return "No";
        }
        long sqrtNum = (long) Math.sqrt(num);
        if (sqrtNum * sqrtNum == num) {
            return "Yes";
        }
        return "No";

    }


    public static void main(String[] args) {
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(2500));
        System.out.println(isPerfectSquare(8));


    }

}
