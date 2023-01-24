package com.ArraySnacks;

public class Reverse {
    public static void main(String[] args) {
//        String reverseString = reverseString("hello world");
        String reverseString2 = reverseString("Technology");
//        System.out.println(reverseString);
        System.out.println(reverseString2);
        System.out.println(returnString("Semicolon"));
    }

    public static String reverseString(String word) {
      // StringBuffer reverseWord = new StringBuffer("hello world");
       StringBuilder reverseWord2= new StringBuilder("Technology");
       // return reverseWord.reverse().toString();
        return reverseWord2.reverse().toString();
    }




    public static String returnString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;
    }
}

