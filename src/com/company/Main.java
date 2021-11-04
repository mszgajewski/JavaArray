package com.company;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println(main_function(new String[] {"[3, 2, 1]", "[6, 5, 4]"}));

        }

    public static String main_function(String[] input) {

        String[] str1 = input[0].substring(1, input[0].length() - 1).replaceAll("\\s+", "").split(",");
        String[] str2 = input[1].substring(1, input[1].length() - 1).replaceAll("\\s+", "").split(",");

        int maxArrLength = Math.max(str1.length, str2.length);

        int[] resultIntArray = new int[maxArrLength];

        for (int i = 0; i < maxArrLength; i++) {
            if (str1.length > i) resultIntArray[i] += Integer.valueOf(str1[i]);
            if (str2.length > i) resultIntArray[i] += Integer.valueOf(str2[i]);
        }

        return Arrays.toString(resultIntArray);
    }
}