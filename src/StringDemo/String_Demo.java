package StringDemo;

public class String_Demo {
  
  public static void main(String[] args) {
	
	//Concat
	
	String str = "Hello";
	String str1 = "Helloo";
	String strTwo = " World!";
	
	System.out.println(str + strTwo);
	System.out.println(str.concat(strTwo));
	
	
	//HashCode method..
	
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	System.out.println("Hello".hashCode());
	
	
	//Contains (boolean value)
	
	System.out.println("Java Learning!!".contains("Java"));
	
	//compareTo()//
	
	System.out.println("epple".compareTo("banana"));
	
	
	//compareToignoreCase()
 
	System.out.println("apple".compareTo("Apple"));
	System.out.println("apple".compareToIgnoreCase("Apple"));
	
  }
  
  
}
