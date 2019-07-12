package ControlFlow.LoopsInJava.ForLoop;

public class ForLoopWithArray {
  
  public static void main(String[] args) {
	
    //Array can hold more one value at time..
	//Array always starts index zero
    int arr[] = {12,22,33,44,55};
	System.out.println(arr.length);
	System.out.println(arr[2]);
 
	int []arrOne = new int[3];
	System.out.println(arrOne[0]);
	
	arrOne[0] = 4;
	arrOne[1] = 7;
	arrOne[2] = 9;
 
	System.out.println(arrOne[0]);
	
	int arrTwo[] = {2,11,45,9};
	
	for(int i = 0; i < arrTwo.length; i++){
	  System.out.print(arrTwo[i] + " ");
	}
	
	
  
  
  }
}
