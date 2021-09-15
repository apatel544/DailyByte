package com.dailybyte;


import java.lang.reflect.Array;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        // Test cases
        String[] s1 = {"colorado", "color", "cold"};
        String[] s2 = {"a", "b", "c"};
        String[] s3 = {"spot", "spotty", "spotted"};

        // invoking the method to iterate through the passed Array of strings
        System.out.println(longestComPrefix(s1));
//        System.out.println(longestComPrefix(s2));
//        System.out.println(longestComPrefix(s3));
    }

    public static String longestComPrefix(String[] a) {
        String prefix = "";
        char c1;
        boolean checkIfMatch;
        for (int i = 0; i < a[i].length() - 1; i++){
            c1 = a[i].charAt(i);
            // we need to check if c1 matches the same in the other two strings
            for (int j = 0; j < a.length - 1; j++){
                if(c1 == a[j].charAt(i)){
                    System.out.println(a[j] + " " + a[j].charAt(i));
                    System.out.println("hit");
                    checkIfMatch = true;
                } else {
                    checkIfMatch = false;
                }

                if (checkIfMatch){
                    prefix += c1;
                } else {
                    break;
                }
            }
        }

        return prefix;
    }
}
