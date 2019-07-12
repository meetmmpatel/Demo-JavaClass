package File_IO;

import java.io.File;
import java.io.IOException;

public class HideTheFile {
  public static void main(String[] args) throws IOException {
	
	
	File file = new File("FileToHiden.txt");
	
	if (file.createNewFile()) {
	  System.out.println("File has been created");
	  
	}else {
	  System.out.println("File is already exists");
	}
	
	boolean ishidden = file.isHidden();
	System.out.println(ishidden);
	
//	try{
//	if (file.isHidden()){
//	  System.out.println("File is hidden");
//	}else {
//	  System.out.println("Not hidden");
//	}}
//	catch (SecurityException e){
//	  System.out.println("Exceptions");
//	}
	
	
  }
}
