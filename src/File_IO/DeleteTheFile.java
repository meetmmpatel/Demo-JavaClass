package File_IO;

import java.io.File;


public class DeleteTheFile {
  
  public static void main(String[] args) {
  
    try{
	File file = new File("TestFileOne.txt");
	
	if (file.createNewFile()){
	  System.out.println("File is created..");
	}
	
	Thread.sleep(15000);
 
	if (file.delete()){
	  System.out.println("File has been deleted");
	}else {
	  System.out.println("File cannot be deleted");
	}
  
  }
    catch (Exception e){
	  System.out.println("exception");
	}
  }
}
