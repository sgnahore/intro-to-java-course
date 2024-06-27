package com.cbfacademy.search;

public interface Search {
    /**
     * Searches an array.
     *
     * @param sortedArray The array to be searched (the array must be sorted)
     * @param target      The value being searched for
     * @return The array index of the target value, or -1 if the value is not found   
     */

    int search(int[] sortedArray, int target);
    
}

class BinarySearch implements Search{
    public int search(int[] sortedArray, int target){
    int left = 0;
    int right = sortedArray.length - 1;
    int middle;
    while (left <= right){
        middle = (left + right) / 2;
        if (sortedArray[middle] == target){
            return middle;
        } else if (sortedArray[middle] > target){
            right = middle -1;
        }  else {
            left = middle + 1;
        } 
    }
    
    return -1;

}
}