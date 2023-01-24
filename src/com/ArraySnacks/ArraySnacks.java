package com.ArraySnacks;

import java.util.Arrays;
import java.util.Objects;

public class ArraySnacks {
    public static int largeNumberArray(int [] largeArray) {
        for (int i = 0; i < largeArray.length; i++) {
            for (int j = i + 1; j < largeArray.length; j++) {
                int temp = 0;
                if(largeArray[i] > largeArray[j]){
                    temp = largeArray[i];
                    largeArray[i] = largeArray[j];
                    largeArray[j] = temp;
                }

            }

        }
        return largeArray[largeArray.length - 1];

    }

    public static int[] reverseArray(int [] reverseArr){
        int count = 0;
        int [] reverse = new int [reverseArr.length];
        for (int i = reverseArr.length -1; i >= 0; i--) {
            reverse[count] = reverseArr[i];
            count++;



        }
        return reverse;
    }

    public static boolean checkNumberExist(int [] existNumber, int number){
        for (int i = 0; i < existNumber.length; i++) {
            if (existNumber[i] == number){
                return true;
            }

        }
        return false;
    }

        public static void checkOddNumberIndex(int []array) {
        String numbers = "";
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                numbers += array[i];

            }

        }
        System.out.println(numbers);


        }

    public static void main(String[] args) {
        int [] array = {1,4,6,9,7,13};
        ArraySnacks.checkOddNumberIndex(array);
    }


    public static String checkForEvenNumber(int [] array){
        String numbers = "";
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                numbers += array[i];
            }

        }
        return numbers;
    }
    public static int sumArray(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    public static String checkForPalindrome(String word){
        int wordLength = word.length();
        String wordReverse ="";
        for (int i = wordLength -1; i >= 0; i--) {
            wordReverse = wordReverse + word.charAt(i);
        }
        if (word.equals(wordReverse)){


        }


        return wordReverse;
    }
    public static int checkSum(int [] array){
        int sum = 0;
        int count = 0;
        while(count < array.length){
            sum += array[count];
            count++;
        }
         return sum;
    }

    public static int checkSums(int [] array){
        int count = 0;
        int sum = 0;
        do{
            sum+=array[count];
            count++;
        }while(count < array.length);

        return sum;
    }

    public static String [] concatArray(int [] array1, String [] array2){
        String [] concatArray = new String[array1.length + array2.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            concatArray[count] = array2[i];
            count++;
            concatArray[count] = String.valueOf(array1[i]);
            count++;

        };
        return concatArray;
    }
    public static String [] concatArray2(String [] array1, int [] array2){
        String [] addIntAndString = new String [array1.length + array2.length];
        int count = 3;
        for (int i = 0; i < array1.length; i++) {
            addIntAndString[i] = array1[i];

        }
        for (int i = 0; i < array2.length; i++) {
            addIntAndString[count] = String.valueOf(array2[i]);
            count++;

        }
        return addIntAndString;
    }
    public static char [] dynamicNumber(int number) {
        String numberString = "";
        numberString  += number;
        System.out.println(numberString);
        int numberLength = numberString.length();
        char [] numberContent = new char[numberLength];
        for (int i = 0; i < numberContent.length; i++) {
            System.out.println(numberString);
            numberContent[i] = numberString.charAt(i);
            System.out.println(numberString.charAt(i));
        }
        System.out.println(Arrays.toString(numberContent));
        return numberContent;

    }
}