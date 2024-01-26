package org.example;

public class Search2 {

    public int binarySearchIterative(int[] array, int target){
        int left = 0;
        int right = array.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;

            if(target < array[middle]){
                right = middle - 1;
            } else if(target > array[middle]){
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] array, int target){
        return binarySearchRecursive(array, target, 0 , array.length - 1);
    }

    private int binarySearchRecursive(int[] array, int target, int left, int right) {
        if(left > right) return  -1;

        int middle = (left + right)/2;

        if (target == array[middle]) return middle;

        if(middle > target){
            right = middle - 1;
        }else {
            left = middle + 1;
        }
       return binarySearchRecursive(array, target, left, right);
    }
}
