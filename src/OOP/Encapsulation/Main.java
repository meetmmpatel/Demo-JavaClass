package OOP.Encapsulation;

public class Main {
  
  
  public static void main(String[] args) {
	
	
	getCar("VAN", "V6", 4, 25000);
	getCar("SUV", "V4", 4, 25056);
	getCar("SADAN", "V8", 4, 25059);
	
	
  }
  
  
  public static Car getCar(String type, String engineType, int w, int p) {
	
	Car car = new Car();
	car.setCarType(type);
	car.setEngineType(engineType);
	car.setNoOfWheels(w);
	car.setPrice(p);
	System.out.println(car.hashCode());
	System.out.println(car);
	return car;
	
  }
  
  
}
