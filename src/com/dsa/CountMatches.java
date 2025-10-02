package com.dsa;
/*
1688. Count of Matches in Tournament

You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.

Return the number of matches played in the tournament until a winner is decided.



Example 1:

Input: n = 7
Output: 6
Explanation: Details of the tournament:
        - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
        - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
        - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.

Example 2:

Input: n = 14
Output: 13
Explanation: Details of the tournament:
        - 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
        - 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
        - 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
        - 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 7 + 3 + 2 + 1 = 13.*/

public class CountMatches {

    static int countMatches(int teams){
        int advance = teams;
        int matchPlayed =0 ;

        while(advance != 1){
            int matches = matchs(advance);
            matchPlayed += matches;
            advance = advance - matches;
        }

        return  matchPlayed;
    }

    static  int matchs(int num){
        if (num % 2  == 0){
            return num / 2;
        }
        return (num-1)/2 + 1;
    }

//
//    No matter how the tournament is structured (even teams, odd teams, byes, etc.), the total number of matches is always the same:
//
//            👉 n - 1 matches for n teams
//
//🔎 Why is it always the same?
//
//    Think of it this way:
//
//    We start with n teams.
//
//    We need to find 1 winner.
//
//    That means all other n-1 teams must be eliminated.
//
//    Now, in a tournament:
//
//    Every match eliminates exactly 1 team.
//
//    So to eliminate n-1 teams, we must play exactly n-1 matches.
//            There’s no way around it — you can’t eliminate 2 teams in 1 match, and you can’t have fewer than n-1 eliminations.
    public static int countMatchesOpt(int teams){
        return teams-1;
    }

    public static void main(String[] args) {
        System.out.println(countMatches(14));
        System.out.println(countMatches(7));
    }
}
