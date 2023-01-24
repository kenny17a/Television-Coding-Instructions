package com.ArraySnacks;

import java.util.Arrays;

public class CartyApp {
    public static void main(String[] args) {
        char [] unicorns = new char[6];
        String str = "Cohort Twelve";
        str.getChars(7, 13, unicorns, 0);
        System.out.println(Arrays.toString(unicorns));
    }

}
