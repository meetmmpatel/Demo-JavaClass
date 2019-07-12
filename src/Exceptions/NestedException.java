package Exceptions;

public class NestedException {
  
  public static void main(String[] args) {
	//Main try
	try {
	  //second try block
	  try {
		//third try block
		try {
		  int arr[] = {1, 2, 3, 4};
//		  int numone = 10/0;
		  String str = null;
		  System.out.println(str.charAt(6));
		  System.out.println(arr[10]);
		} catch (ArithmeticException e) {
		  System.out.println("ArithmeticException");
		  System.out.println();
		}
	  } catch (ArithmeticException e) {
		System.out.println("ArithmeticException");
		System.out.println("In second try catch block");
	  }
	} catch (ArithmeticException e) {
	  System.out.println("Arithmetic exception");
	  System.out.println("In Main try-block");
	} catch (ArrayIndexOutOfBoundsException e) {
	  System.out.println("ArrayIndexOutOfBoundsException");
	  System.out.println("In Main try-block");
	} catch (Exception e) {
	  System.out.println("something went wrong..");
	  System.out.println("In Main try-block");
	}
	
	
  }
}
