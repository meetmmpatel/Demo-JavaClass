package codeTest;

public class StringTest {
  
  public static void main(String[] args) {
	firstHalf("HelloThere");
	firstTwo("ab");
  }
  
  /*
  Given a string of even length, return the first half.
  So the string "WooHoo" yields "Woo".
  
	firstHalf("WooHoo") → "Woo"
	firstHalf("HelloThere") → "Hello"
	firstHalf("abcdef") → "abc"
   */
  
  public static String firstHalf(String str) {
	
	if (str.length() % 2 == 1) {
	  return "not valid";
	} else {
	  String s = str.substring(0, str.length() / 2);
	  System.out.println(s);
	  return s;
	  
	}
  }
  
  /*
	firstTwo("Hello") → "He"
	firstTwo("abcdefg") → "ab"
	firstTwo("ab") → "ab"
	 */
  
  public static String firstTwo(String  str){
    
    if (str.length() < 2){
      return str;
	}
    String s = str.substring(0,2);
	System.out.println(s);
    return s;
    
  }
  
}
