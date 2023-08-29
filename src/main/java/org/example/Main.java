package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {23,56,12,5,8,9, 1,3,4};

        Arrays.sort(array);
        var search = new Search();
        var result = search.exponentialSearch(array, 56);

        System.out.println(result);
    }
}