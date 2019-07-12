package OOP.Inheritance;

public class Mainclass {
  
  public static void main(String[] args) {
	
	Three three = new Three();
	three.print_name();
//	three.print_num();
	three.print_message();
	three.num = 10;
 
	System.out.println("This is three" + new Three());
	
  }
  
}


class one {
  public void print_name() {
	System.out.println("Java");
  }
}


class Two extends one {
  int num = 10;
  
  public Two() {
	System.out.println("Java + 12");
  }
  
  @Override
  public String toString() {
	return "Two{" +
			"num=" + num +
			'}';
  }
}

class Three extends Two {
  
  public Three() {
    super();
	System.out.println("This is three");
  }
  
  public void print_message() {
  
	Two t = new Three();
	t.num = 12;
	System.out.println("Text message");
  }
  
  @Override
  public String toString() {
	return "Three{}";
  }
}
