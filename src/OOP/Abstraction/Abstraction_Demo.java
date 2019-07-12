package OOP.Abstraction;

public class Abstraction_Demo  extends Demotest{
  
  
  @Override
  void myMethod() {
	System.out.println("this override method");
  }
  
  public static void main(String[] args) {
	Demotest demo = new Abstraction_Demo();
	demo.myMethod();
  }
}

abstract class Demotest {
  
  // you can not create an instance of an abstract class
  // can have method also as abstract method.
  // all abstract methods are public ..
  // all abstract methods must be override by child class..
  // you are not allowed to have body of method for abstract method.
  
  abstract void myMethod();
  
  
}
