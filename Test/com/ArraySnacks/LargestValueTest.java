package com.ArraySnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestValueTest {
    @Test
    public void testForLargeValue(){
        int[] largeArray = {7, 2, 1, 9, 3};

        assertEquals(9,ArraySnacks.largeNumberArray(largeArray));
    }
    @Test
    public  void testForReverseArray(){
        int [] array = {9,8,7,6,5};
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, ArraySnacks.reverseArray(array) );
    }
    @Test
    public void testExistNumber(){
        int [] existNumber = {1,2,3,4,7};
        assertTrue(ArraySnacks.checkNumberExist(existNumber, 1));
    }


    @Test
    public void testForEvenNumbersAtIndexPosition(){
        int [] array = {4,1,9,7,11,15,5};
        assertEquals("49115", ArraySnacks.checkForEvenNumber(array));
    }

    @Test
    public void testForSumArray(){
        int [] array = {1,2,3,4,5};
        assertEquals(15, ArraySnacks.sumArray(array));
    }

    @Test
    public void testForPalindrome(){
        String word = "mum";
        assertEquals("mum", ArraySnacks.checkForPalindrome(word));
    }
    @Test
    public void testUsingWhileLoop(){
        int [] array = {1,2,3,4,5};
        assertEquals(15,ArraySnacks.checkSum(array));
    }
    @Test
    public void testUsingDoWhileLoop(){
        int [] array = {1,2,3,4,5};
        assertEquals(15,ArraySnacks.checkSums(array));
    }

    @Test
    public void testForConcatArray(){
        int [] array1 = {1,2,3};
        String [] array2 = {"a", "b", "c"};
        assertArrayEquals(new String[]{"a", "1", "b", "2", "c", "3"},ArraySnacks.concatArray(array1,array2));
    }

    @Test
    public void testForJoinArray(){
        String [] array1 = {"a","b","c"};
        int [] array2 = {1,2,3};
        assertArrayEquals(new String[]{"a","b","c","1","2","3"}, ArraySnacks.concatArray2(array1, array2));
    }
    @Test
    public void numberTurnArrayTest(){
        int number = 1234;
        assertArrayEquals(new char[]{'1', '2', '3', '4'}, ArraySnacks.dynamicNumber(number));
    }

}
