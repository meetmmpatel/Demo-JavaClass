package Exceptions;

public class ThrowExample {
  
  
  public static void main(String[] args) {
	
	checkEleigility(15, 69);
  }
  
  
  static void checkEleigility(int stuAge, int stuWeigth) {
	
	if (stuAge < 12 && stuWeigth < 40) {
	  throw new ArithmeticException("Student is not eligible ");
	} else {
	  System.out.println("Student is eligible");
	}
	
	
  }
}
