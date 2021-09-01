package com.dailybyte;

public class ReverseString {

    public static void main(String[] args) {
        // initialize string test cases
        String s1 = "Cat";
        String s2 = "The Daily Byte";
        String s3 = "Civic";

        //Prints out the return of
        System.out.println(revString(s1));
        System.out.println(revString(s2));
        System.out.println(revString(s3));
    }
    // creating a new method to perform the reversal of the string
    public static String revString(String s) {
        // empty string is used for storing the values the for loops iterates through
        String backwardsString = "";
        // for-loop
        for (int i = s.length() - 1; i >= 0; i--){
            backwardsString += s.charAt(i);
            //every iteration of the loop will store a new letter to the backwardsString string
            // this for loop will always start at the last index of the string, aka s.length() - 1 , and
            //    from there the code block will store the character at the same index into the empty
            //    string backwardsString
            // loop 1: backwardsString = "t";
            // loop 2: backwardsString = "ta";
            // loop 3: backwardsString = "taC";
            // end loop
        }

        // return the newly created string, backwardsString
        return backwardsString;
    }
}
