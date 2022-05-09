package week3.day1;

public class MyCar {
 public static void main(String[] args) {
	/* 1. Create a class "Vehicle"
	 applyBrake()
	 soundHorn()
	 2. Create a sub class for Vehicle -> "Car"
	 handBrake()
	 turnAC()
	 3. Create a sub class for Car -> "BMW"
	 autoPark()
	 4. Create a class MyCar
	 main()
	 Create object for BMW,Car,Vehicle */
	 Car obj1 = new Car();
	 obj1.turnAC();
	 obj1.soundHorn();
	 obj1.applyBrake();
	 obj1.handBrake();
	 
	 BMW obj = new BMW();
	 obj.turnAC();
	 obj.autoPark();
	 obj.soundHorn();
	 obj.applyBrake();
	 obj.handBrake();
	 
}
}
