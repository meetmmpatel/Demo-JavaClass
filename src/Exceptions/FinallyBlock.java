package Exceptions;

public class FinallyBlock {
  
  /*
  try{}
  catch(){
  }finally{
  }
  
  you can have try with finally or try with catch and finally
   
   */
  
  public static void main(String[] args) {
	withFinally();
	
  }
  
  
  public static void withFinally() {
	try {
	  int num = 120 / 1;
	  System.out.println(num);
	} catch (ArithmeticException e) {
	  System.out.println("Exception");
	} finally {
	  System.out.println("This is finally block");
	  try {
		System.out.println("something");
	  } finally {
		System.out.println("This is sub finally block");
	  }
	}
	
	
  }
  
  
}
