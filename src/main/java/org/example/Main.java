package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {23,56,12,5,8,9, 1,3,4};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        var search = new Search();

        var result = search.binarySearchRecursion(array, 57);

        System.out.println(result);
    }
}