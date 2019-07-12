package Class_Definition;

public class Object_IN_Java {
  
  
  //Fields  or Variables
   //1.Global
  // 2.Local
  
  //Method/function in class.
  
  //Types of Method/Function in java
  //1. Static vs non-static
  //2. void vs non-void
  //3. with parameter or without parameter.
  

  
  public static void main(String[] args) {
    getInfo();
	
    getRefA();
    getRefB();
  }
  
  public static void getInfo(){
	 int n = 10;
	 int i = 10;
    i = 15;
    n = 25;
  }
  
  public static void getRefA(){
    String str = "Test";
	System.out.println(str);
	System.out.println("A");
  }
  
  public static void getRefB(){
	System.out.println("B");
  }
  
}
