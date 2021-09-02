package com.dailybyte;

public class CorrectCapitalization {

    public static void main(String[] args) {
        String usa = "USA"; // return true
        String name = "Calvin"; // return true
        String comp = "compUter"; // return false
        String dev = "coding"; // return true

        //
        System.out.println(correctCap(usa));
        System.out.println(correctCap(name));
        System.out.println(correctCap(comp));
        System.out.println(correctCap(dev));

    }
    public static boolean correctCap(String s) {

        if(s.equals(s.toUpperCase())) {
            return true;
        } else if(s.substring(1).equals(s.substring(1).toLowerCase())){
            return true;
        } else {
            return false;
        }

    }
}
