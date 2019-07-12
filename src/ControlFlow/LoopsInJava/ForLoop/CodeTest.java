package ControlFlow.LoopsInJava.ForLoop;

public class CodeTest {
  
  /*
  Given an array of ints, return the number of 9's in the array.
  arrayCount9([1, 2, 9]) → 1
  arrayCount9([1, 9, 9]) → 2
  arrayCount9([1, 9, 9, 3, 9]) → 3
   */
  
  /*
  Given an array of ints, return true if one of the first 4 elements in
  the array is a 9. The array length may be less than 4.
	arrayFront9([1, 2, 9, 3, 4]) → true
	arrayFront9([1, 2, 3, 4, 9]) → false
	arrayFront9([1, 2, 3, 4, 5]) → false
   */
  
  public static void main(String[] args) {
	
	int arrayCount9[] = {1, 9, 9, 3, 9};
	int count = 0;
	for (int i = 0; i < arrayCount9.length; i++) {
	  
	  if (arrayCount9[i] == 9) {
		count++;
	  }
	}
	
	System.out.println(count);
	
	
	int numArray[] = {1, 2, 0, 4, 9};
	
	if (numArray.length > 4){
	  System.out.println("skip ");
	  
	  for (int i = 0; i < numArray.length -1; i++){
	    if (numArray[i] == 9){
		  System.out.println(true);
		}
	  
	  }
	  
	  
	}
	
	
	
  }
}
