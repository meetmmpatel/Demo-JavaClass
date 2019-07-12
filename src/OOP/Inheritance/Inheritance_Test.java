package OOP.Inheritance;

public class Inheritance_Test {
  
  public static void main(String[] args) {
    
    MountainBike bike = new MountainBike(2,4,8);
	bike.setHeigth(5);
  
  
  }
}

class Bicycle{
  
  int gear;
  int speed;
  
  public Bicycle(int gear, int speed) {
	this.gear = gear;
	this.speed = speed;
  }
  
  public void applyBrake(int decrement){
    speed -= decrement;
  }
  
  public void speedUp(int increment){
    speed += increment;
  }
  
  @Override
  public String toString() {
	return "Bicycle{" +
			"gear=" + gear +
			", speed=" + speed +
			'}';
  }
}

class MountainBike extends Bicycle{
  
  int seatHeigt;
  
  public MountainBike(int gear, int speed, int seatHeigt) {
	super(gear, speed);
	this.seatHeigt = seatHeigt;
 
	System.out.println("Gear" + gear + "\n" + "speed" + speed + "\n" + seatHeigt);
  }
  
  
  public void setHeigth(int value){
    this.seatHeigt = value;
	System.out.println(seatHeigt);
  }
  
  @Override
  public String toString() {
	return "MountainBike{" +
			"seatHeigt=" + seatHeigt +
			'}';
  }
}


