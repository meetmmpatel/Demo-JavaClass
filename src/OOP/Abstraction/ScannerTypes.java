package OOP.Abstraction;

public class ScannerTypes implements wifi,Color,Fax,Scan {
  
  
  @Override
  public String connectWifi() {
    System.out.println("Wifi connection ");
    return "Wifi";
  
  }
  
  @Override
  public void printColor() {
    System.out.println("Print document");
  
  }
  
  @Override
  public void sendFax() {
    System.out.println("Sending fax");
  
  }
  
  @Override
  public void scanDocument() {
    System.out.println("Scan document");
  
  }
  
  public static void main(String[] args) {
    
    ScannerTypes scanOne = new ScannerTypes();
    System.out.println("Scanner One");
    scanOne.connectWifi();
    scanOne.printColor();
    
    ScannerTypes scanTwo= new ScannerTypes();
    System.out.println("\n" + "Scanner Two");
    scanTwo.connectWifi();
    scanTwo.printColor();
    scanTwo.sendFax();
  
    ScannerTypes scanFour= new ScannerTypes();
    System.out.println("\n" + "Scanner Three");
    scanFour.connectWifi();
    scanFour.printColor();
    scanFour.sendFax();
    scanFour.scanDocument();
    
  }
}


interface  wifi {
   String connectWifi();
}

interface Color {
   void printColor();
}

interface Fax {
   void sendFax();
}

interface Scan{
   void scanDocument();
}