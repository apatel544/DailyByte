package com.dailybyte;

public class AddBinary {
    public static void main(String[] args) {
//        System.out.println(addBinary("100", "1"));
//        System.out.println(addBinary("11", "1"));
//        System.out.println(addBinary("1", "0"));
        System.out.println(addBinary("1000","1001"));
    }

    public static String addBinary(String b1,String b2) {
        int a = Integer.parseInt(b1,2);
        int b = Integer.parseInt(b2,2);
        int sum = a + b;
        System.out.println(a);
        System.out.println(b);
        return Integer.toBinaryString(sum);
    }
}
