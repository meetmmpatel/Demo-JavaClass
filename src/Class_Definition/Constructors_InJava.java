package Class_Definition;

public class Constructors_InJava {
  
  String name;
  
  //Creating Constructors in java
  
  //types of Constructors in java
  // 1. Default
  // 2. No-arg
  // 3. Parameterized
  
  
  //No-Arg
  public Constructors_InJava() {
	
	this.name = "Test Java Constructor!!";
  }
  
  //Parameterized
  public Constructors_InJava(String name){
    this.name = name;
	System.out.println(name);
	System.out.println("Some code");
  
  }
  
  public static void main(String[] args) {
	
	Constructors_InJava obj = new Constructors_InJava();
	System.out.println(obj.name);
	
	Constructors_InJava objOne = new Constructors_InJava("Test");
	
  }
  
}
