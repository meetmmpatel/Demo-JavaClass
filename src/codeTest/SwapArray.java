package codeTest;

import java.util.Arrays;

public class SwapArray {
  
  
  public static void main(String[] args) {
	
	int a[] = {8, 6, 7, 9, 5};
	swapEnds(a);
	
	int b [] = {5, 2, 3};
	maxTriple(b);
	
	
  }
  
  /*
  Given an array of ints, swap the first and last elements
  in the array. Return the modified array.
  The array length will be at least 1.

	swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	swapEnds([1, 2, 3]) → [3, 2, 1]
	swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
   */
  public static int[] swapEnds(int[] nums) {
	// variable will have same value as array first element
	int temp = nums[0];
	
	nums[0] = nums[nums.length - 1];
	nums[nums.length - 1] = temp;
	
	
	System.out.println(Arrays.toString(nums));
	return nums;
	
	
	
	
  }
  
  /*
  Given an array of ints of odd length,
  look at the first, last, and middle values
  in the array and return the largest.
  The array length will be a least 1.

	maxTriple([1, 2, 3]) → 3
	maxTriple([1, 5, 3]) → 5
	maxTriple([5, 2, 3]) → 5
   */
  
  public static int maxTriple(int [] nums){
    
    int max = nums[0];
    
    if (max < nums[nums.length/ 2])
      max = nums[nums.length/2];
	
    
    if (max < nums[nums.length - 1])
      max = nums[nums.length - 1];
	
	System.out.println(max);
    return max;
    
  }
  
  
}
