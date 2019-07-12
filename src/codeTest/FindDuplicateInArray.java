package codeTest;

public class FindDuplicateInArray {
  
  public static void main(String[] args) {
	
	int a[] = {1, 2, 3, 5, 4, 4};
	
	System.out.println("Duplicate Element : " + findDuplicate(a));
	
  }
  
  //method that will return duplicate value if any...
  public static int findDuplicate(int[] arr) {
	
	boolean verify[] = new boolean[arr.length + 1];
	
	
	for (int i = 0; i < arr.length; i++) {
	  
	  if (verify[arr[i]]) {
		return arr[i];
	  }
	  verify[arr[i]] = true;
	  
	  
	}
	
	//no duplicate
	
	return -1;
	
  }
  
  
}
