package com.dailybyte;

public class VacuumCleanerRoute {

    public static void main(String[] args) {
        // Test cases for vacuum movements
        String one = "LR"; //return true
        String two = "URURD"; // return false
        String three = "RUULLDRD"; // return true

        System.out.println(vacuumMoves(one));
        System.out.println(vacuumMoves(two));
        System.out.println(vacuumMoves(three));
    }

    public static boolean vacuumMoves(String s) {
        // sets counter for L and R;  L = -1 and R = 1;
        int count = 0;
        // sets counter for D and U;  D = -1 and U = 1;
        int secCount = 0;

        // for loop that iterates through the test case String
        for (int i = 0; i < s.length(); i++) {
            // if-else that checks increments or decrements based on character sequence
            if (s.charAt(i) == 'R') { //Increments count if character 'R' is found
                count++;
            } else if (s.charAt(i) == 'L') { //Increments count if character 'L' is found
                count--;
            } else if (s.charAt(i) == 'U') { //Increments secCount if character 'U' is found
                secCount++;
            } else if (s.charAt(i) == 'D') { //Increments secCount if character 'D' is found
                secCount--;
            }
        }
        // returns true if count and secCount == 0
        return (count == 0 && secCount == 0);
    }
}
