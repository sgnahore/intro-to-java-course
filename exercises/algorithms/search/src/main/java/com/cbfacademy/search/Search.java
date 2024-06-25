package com.cbfacademy.search;

public interface Search {
    /**
     * Searches an array.
     *
     * @param sortedArray The array to be searched (the array must be sorted)
     * @param target      The value being searched for
     * @return The array index of the target value, or -1 if the value is not found
     * 
     * do until the pointers low and high meet each other.
    //find the index at the mid point of the given array (add the lowest index to the highest index and divide by two, e.g. 0 + 10 / 2 = 5)
    mid = (low + high)/2
    //if the target value is the mid point element
    if (target == arr[mid])
        // return the index number for the mid point of the array 
        return mid
    // if the target value is higher than the value of the mid point element 
    else if (target > arr[mid]) // target could be on the right side of the array
        // set the low index to the right of the middle 
        low = mid + 1
    // in all other cases
    else                       // target could be on the left side of the array
        // set the high index to the left of the middle
        high = mid - 1
     */
    int search(int[] sortedArray, int target);
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
