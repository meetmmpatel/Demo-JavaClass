package Exceptions;

import java.util.Arrays;

public class ExampleTwo {
  
  
  public static void main(String[] args) {
	
	try {
	  int arr[] = new int[7];
	  arr[4] = 30;
	  System.out.println(Arrays.toString(arr));
	  arr[50] = 23 / 1;
	  System.out.println("In try block");
	} catch (ArithmeticException e) {
	  System.out.println("Warning : Arithmetic Exception");
	} catch (ArrayIndexOutOfBoundsException e) {
	  System.out.println("Outside of an array");
	} catch (Exception e) {
	  System.out.println("something went wrong..");
	}
	
	System.out.println("Out side of try catch block");
	
	
  }
  
}
