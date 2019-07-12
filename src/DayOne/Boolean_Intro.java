package DayOne;

public class Boolean_Intro {
  
  public static void main(String[] args) {
	
	boolean b1 = true;
	boolean b2 = false;
	
	int b3 = (10 > 20) ? 10 : 204;
	System.out.println(b3);
	
	if (100 < 20) {
	  System.out.println("This is true");
	} else {
	  System.out.println("This is false");
	}
	
	//Wrapper class in java..
	Boolean bull = Boolean.valueOf("TRUE");
	System.out.println(bull);
	
  }
}
