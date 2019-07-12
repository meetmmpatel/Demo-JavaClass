package OOP.Abstraction;

public class Zoo {
  
  public static void main(String[] args) {
	
	Dog dog = new Dog();
	dog.move();
	dog.run();
	dog.swim();
	dog.someMethod();
	
	Animal horse = new Horse();
	horse.swim();
	horse.run();
	horse.move();
	
	
  }
  
  
}


abstract class Animal {
  
  abstract void move();
  
  abstract void run();
  
  abstract void swim();
  
  void someMethod(){
	System.out.println("some method");
  }
  
  
}

abstract class Mamel extends Animal{
  
  abstract void walk();
}

class Dog extends Mamel {
  
  @Override
  void move() {
	
  }
  
  @Override
  void run() {
	
  }
  
  @Override
  void swim() {
	
  }
  
  @Override
  void walk() {
	
  }
}

class Horse extends Animal {
  
  @Override
  void move() {
	
  }
  
  @Override
  void run() {
	
  }
  
  @Override
  void swim() {
	
  }
}