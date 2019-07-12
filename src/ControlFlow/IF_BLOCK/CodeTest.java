package ControlFlow.IF_BLOCK;

import java.util.Scanner;

public class CodeTest {
  
  static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args) {
//	testOne();
//	testTwo();
	testThree();
  }
  
  //1 .Write a Java program to get a number from the user and print whether it is positive or negative
  
  static void testOne() {
	
	int a = scan.nextInt();
	if (a >= 0) {
	  System.out.println("Number is positive");
	} else {
	  System.out.println("Number is negative");
	}
	
  }
  
  //2 Take three numbers from the user and print the greatest number.
  
  static void testTwo() {
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	int a1 = (a > b) ? a : b;
	int temp = (c > a1) ? c : a1;
	
	System.out.println("largest value: " + temp);
	
  }
  
  // 3. Write a Java program that reads a floating-point number
  // and prints "zero" if the number is zero.
  // Otherwise, print "positive" or "negative". Add "small" if the absolute value of
  // the number is less than 1, or "large" if it exceeds 1,000,000
  
  
  static void testThree() {
	
	float f1 = scan.nextFloat();
	
	if(f1 > 0){
	  
	  if(f1 < 1){
		System.out.println("Small");
	  }
	  else if(f1 > 1000000){
		System.out.println("Positive and Large");
	  }
	  else {
		System.out.println("Positive");
	  }
	}
	else if(f1 < 0){
	  System.out.println("negative");
	}else {
	  System.out.println("Zero");
	}
	
	
  }
  
}
