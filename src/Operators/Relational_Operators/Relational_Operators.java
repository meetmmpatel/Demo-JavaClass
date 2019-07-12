package Operators.Relational_Operators;

import java.util.Random;

public class Relational_Operators {

/*
  Relational Operators	Description
  >		greater than
  >=	greater than or equal to
  ==	equal to
  !=	not equal to
  <=	less than or equal to
  <		less than
 */
  
  public static void main(String[] args) {
	Random rand = new Random();
	int i = rand.nextInt(100);
	int j = rand.nextInt(100);
	System.out.println("i = " + i);
	System.out.println("j = " + j);
	System.out.println("i > j is " + (i > j));
	System.out.println("i < j is " + (i < j));
	System.out.println("i >= j is " + (i >= j));
	System.out.println("i <= j is " + (i <= j));
	System.out.println("i == j is " + (i == j));
	System.out.println("i != j is " + (i != j));
	
	System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
	System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
	
  }
 
}
