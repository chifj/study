package com.itnet.study.util;


import java.util.*;

public class LetterCombinationUtil {

    private static final Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public static void buildResult(String digits, int index, StringBuilder current,
                                   List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // get integer number
        int num = digits.charAt(index) - '0';
        // 0 and 1 do not map to any letters
        if (num == 0 || num == 1) {
            buildResult(digits, index + 1, current, result);
            return;
        }

        String option = map.get(num);
        for (int i = 0; i < option.length(); i++) {
            current.append(option.charAt(i));
            buildResult(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static List<String> letterCombination(Integer[] input) {
        List<String> output = new ArrayList<>();

        // if there is no digits to check
        if (input == null || input.length == 0) {
            return output;
        }

        StringBuilder digits = new StringBuilder();
        for (Integer digit : input) {
            digits.append(digit);
        }
        buildResult(digits.toString(), 0, new StringBuilder(), output);

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer array separated by spaces(eg. 2 23 26): ");
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.trim().split("\\s{1,}");
            Integer[] arr = new Integer[strs.length];
            for (int i = 0; i < strs.length; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            System.out.println("Input: arr[] = " + Arrays.toString(arr) + "");
            System.out.println("Output: " + letterCombination(arr).toString());
        }
    }
}
