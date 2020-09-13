package arrays;

//Storing an object inside an array

public class ArrayofObject {
	
	public static void main(String args[]) {
		Car toyota = new Car("Blue","Sedan");
		Car Nissan = new Car("Red", "SUV");
	
		Car[] cars = new Car[2];
		cars[0] = toyota;
		cars[1] = Nissan;
	}
}

class Car{
	String color;
	String model;

	Car(String color, String model){
		this.color = color;
		this.model = model;
	}
}

