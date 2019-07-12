package ControlFlow.LoopsInJava.ForLoop;

public class ForEach_Intro {
  
  public static void main(String[] args) {
	
	
	int nums[] = {4, 5, 6, 7, 4, 5, 6, 7};


//  for(int i = 0; i < nums.length; i++){
//	System.out.print(nums[i] + " ");
//  }
	
	for (int i : nums) {
	  if (nums[i] % 2 == 0) {
		System.out.println(nums[i]);
	  }
	}
	
	//User for each loop and only print total of all the elements.
	int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sum = 0;
	
	for (int i : numArray) {
	  
	  sum += i;
	}
	
	System.out.println("Total is : " + sum);
	
	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	for (char c : vowels) {
	  System.out.println(c);
	  
	}
	
	/*
	Given a string and a non-negative int n, return a larger string that
	is n copies of the original string.
	
	stringTimes("Hi", 2) → "HiHi"
	stringTimes("Hi", 3) → "HiHiHi"
	stringTimes("Hi", 1) → "Hi"
	 */
	
	String str = "Hi ";
	int n = 5;
	
	
	String result = "";
	
	for (int i = 0; i < n; i++ ){
	  result = result + str;
	}
	System.out.println(result);
	
	
	
  }
}
