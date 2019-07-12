package OOP.Encapsulation;

public class Car {
  
  
  private String carType;
  private String engineType;
  private int price;
  private int noOfWheels;
  
  public Car() {
  }
  
  public Car(String carType, String engineType, int price, int noOfWheels) {
	this.carType = carType;
	this.engineType = engineType;
	this.price = price;
	this.noOfWheels = noOfWheels;
  }
  
  public String getCarType() {
	return carType;
  }
  
  public void setCarType(String carType) {
	this.carType = carType;
  }
  
  public String getEngineType() {
	return engineType;
  }
  
  public void setEngineType(String engineType) {
	this.engineType = engineType;
  }
  
  public int getPrice() {
	return price;
  }
  
  public void setPrice(int price) {
	this.price = price;
  }
  
  public int getNoOfWheels() {
	return noOfWheels;
  }
  
  public void setNoOfWheels(int noOfWheels) {
	this.noOfWheels = noOfWheels;
  }
  
  @Override
  public String toString() {
	return "Car{" +
			"carType='" + carType + '\'' +
			", engineType='" + engineType + '\'' +
			", price=" + price +
			", noOfWheels=" + noOfWheels +
			'}';
  }
}
