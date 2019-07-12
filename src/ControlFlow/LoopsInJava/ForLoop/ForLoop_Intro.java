package ControlFlow.LoopsInJava.ForLoop;

public class ForLoop_Intro {
  
  
  public static void main(String[] args) {
	//print 0 to 5 in sysout
	
	int i = 1;
	for (; i < 5; i++) {
	  System.out.println(i + " ");
	  
	}
	
	int n = 2;
	for (; n <= 5; n++) {
	  System.out.println(n);
	}
	System.out.println("Value of : n " + n);
	
	
	int j = 0;
	System.out.println(j++);
	System.out.println(j);
	
	  int m = 0;
	  for (; ; ) {
		
		//print the value of m
		System.out.println("Value of m is : " + m);
		
		//post increment the value of m
		m++;
		
		if (m > 4) {
		  break;
		}
		
	  }
	
	
  }
  
  
}
