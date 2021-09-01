package com.dailybyte;

public class ValidPalindrome {

    public static void main(String[] args) {
        // "level", return true
        // "algorithm", return false
        // "A man, a plan, a canal: Panama.", return true

        String p1 = "leveL";
        String p2 = "algorithm";
        String p3 = "A man, a plan, a canal: Panama.";

        System.out.println(palindromeCheck(p1));
        System.out.println(palindromeCheck(p2));
        System.out.println(palindromeCheck(p3));

    }

    public static boolean palindromeCheck(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z]","");
        String backwardString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            backwardString += s.charAt(i);
        }

//        System.out.println(s);
//        System.out.println(backwardString);

        return s.equals(backwardString);


    }
}
