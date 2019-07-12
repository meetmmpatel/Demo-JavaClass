package Class_Definition;

public class Java_Method_Types {
  //Method/function in class.
  
  //Types of Method/Function in java
  //1. Static vs non-static
  //2. void vs non-void
  //3. with parameter or without parameter.
  
  public static void main(String[] args) {
	getRefB();
	
	
	//calling constructor in java
	Java_Method_Types objOne = new Java_Method_Types();
	objOne.getinfo();
	
	
  }
  
  
  
  //1. Static vs non-static
   // Static method are only allowed call via another static method
  
  public static void getRefA(){
    System.out.println("this is A");
  }
  
  public static void getRefB(){
   getRefA();
   
   Java_Method_Types obj = new Java_Method_Types();
   obj.getinfo();
  }
  
  public void getinfo(){
    System.out.println("This is non-static method..");
    getRefA();
  }
  
  
  //class constructor
  // 1. it will always same name as class name.
  // 2 never be static or non-static
  // 3. never be void or return type..
  // 4. with args and without args ..
  
  public Java_Method_Types(){
    System.out.println("This is constructor...");
  }
  
  
}
