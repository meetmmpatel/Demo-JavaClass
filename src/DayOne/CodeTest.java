package DayOne;

public class CodeTest {
  
  public static void main(String[] args) {
	
  // 1. Write a Java program to print
  // "Hello" on screen and then print your name on a separate line.
  
    String strHello = "Hello";
    String name = "TestUser";
	System.out.println(strHello);
	System.out.println(name);
  
  //Write a Java program to print the sum of two numbers.
  //Test Data:
  //74 + 36
  //Expected Output :
  //110
  
	int n1 = 74 + 20;
	int n2 = 36;
	System.out.println(n1 + n2);
  
//	Write a Java program to divide two numbers and print on the screen.
//Test Data :
//50/3
//Expected Output :
//16
 
	double numOne = 50;
	double numTwo = 3;
	System.out.println(numOne/numTwo);
	
//	Write a Java program to print the result of the following operations.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3 * 5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
	
	int a = -5 + 8 * 6;
	System.out.println(a);
	
	double b = (55 + 9) % 9;
	System.out.println(b);
 
	int c = 20 + -3 * 5 / 8;
	System.out.println(c);
	
	int d = 5 + 15 / 3 * 2 - 8 % 3;
	System.out.println(d);
	
  }
}
