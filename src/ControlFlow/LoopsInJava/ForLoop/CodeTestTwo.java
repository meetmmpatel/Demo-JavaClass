package ControlFlow.LoopsInJava.ForLoop;

public class CodeTestTwo {
  /*
  Given an array of ints, return true if 6 appears as either
  the first or last element in the array. The array will be length 1 or more.
	firstLast6([1, 2, 6]) → true
	firstLast6([6, 1, 2, 3]) → true
	firstLast6([13, 6, 1, 2, 3]) → false
   */
  
  
  public static void main(String[] args) {
	
	int numArray[] = {6, 1, 2, 6, 5};
	
	if (numArray[0] == 6 || numArray[numArray.length - 1] == 6) {
	  System.out.println(true);
	}
	
	
  }
  
  
}
