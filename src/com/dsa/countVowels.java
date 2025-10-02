package com.dsa;


//Input : abc de
//Output : 2
//
//Input : geeksforgeeks portal
//Output : 7

public class countVowels {

    static int countVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i=0 ; i<word.length();i++){

            if (isVowel(word.charAt(i))){
                count++;
            }
        }
        return count;
    }

    static boolean isVowel (char c){
        char C= Character.toUpperCase(c);
        return C =='A' || C =='E' || C =='I' || C =='O' || C =='U';
    }

    public static void main(String[] args) {
        System.out.println(countVowels("abc de"));
        System.out.println(countVowels("geeksforgeeks portal"));
    }
}
