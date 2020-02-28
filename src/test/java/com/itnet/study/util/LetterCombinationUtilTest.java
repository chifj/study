package com.itnet.study.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationUtilTest {


    /**
     * Test {@link LetterCombinationUtil#buildResult(String, int, StringBuilder, List)} .
     */
    @Test
    public void buildResultTest() {
        List<String> result0 = new ArrayList<>();
        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();

        LetterCombinationUtil.buildResult("0", 0, new StringBuilder(), result0);
        LetterCombinationUtil.buildResult("0123", 0, new StringBuilder(), result1);
        LetterCombinationUtil.buildResult("0123456789012", 0, new StringBuilder(), result2);

        System.out.println(result0.toString());
        System.out.println(result1.toString());
        System.out.println(result2.toString());
    }

    /**
     * Test {@link LetterCombinationUtil#letterCombination(Integer[])} .
     */
    @Test
    public void letterCombinationTest() {
        Integer[] input0 = new Integer[]{0, 1, 4};
        Integer[] input1 = new Integer[]{0, 1, 2, 3, 1, 0};
        Integer[] input2 = new Integer[]{4, 23};
        Integer[] input3 = new Integer[]{2, 3, 4, 01, 10, 11, 00, 20, 99};


        List<String> output0 = LetterCombinationUtil.letterCombination(input0);
        List<String> output1 = LetterCombinationUtil.letterCombination(input1);
        List<String> output2 = LetterCombinationUtil.letterCombination(input2);
        List<String> output3 = LetterCombinationUtil.letterCombination(input3);

        System.out.println(output0.toString());
        System.out.println(output1.toString());
        System.out.println(output2.toString());
        System.out.println(output3.toString());
    }

}
