package com.dsa;

//Given a number N, the task is to convert every digit of the number into words.
//
//        Examples:
//
//
//
//Input: N = 1234
//Output: One Two Three Four
//Explanation:
//Every digit of the given number has been converted into its corresponding word.
//
//
//
//
//        Input: N = 567
//Output: Five Six Seven


import java.util.Map;

public class NumberToWord {

    static String toWord(int n){
        String num = String.valueOf(n);
        Map<Integer, String> nummap = Map.of(
                0, "Zero",
                1, "One",
                2, "Two",
                3, "Three",
                4, "Four",
                5, "Five",
                6, "Six",
                7, "Seven",
                8, "Eight",
                9, "Nine"
        );

        StringBuilder str = new StringBuilder();
        for(int i =0 ; i <num.length();i++){
            int digitNum= Character.getNumericValue(num.charAt(i));
            str.append(nummap.get(digitNum)).append(" ");
        }
        return str.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toWord(1234));
        System.out.println(toWord(567));
    }
}
