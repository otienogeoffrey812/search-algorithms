package org.example;

public class Search {

    public int binarySearch(int[] array, int target){
        return binarySearch(array, target, 0, array.length - 1);
    }
    private int binarySearch(int[] array, int target, int left, int right){
        if (right < left) return  -1;

        int middle = (right + left)/2;

        if (array[middle] == target) return middle;

        if(array[middle] > target){
           return binarySearch(array, target, left, middle-1);
        }
        return   binarySearch(array, target, middle+1, right);
    }
}
