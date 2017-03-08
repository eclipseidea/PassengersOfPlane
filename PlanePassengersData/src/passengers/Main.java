package passengers;

public class Main {

	public static void main(String[] args) {

		Engine engine1 = new Engine(1000);
		Engine engine2 = new Engine(2000);

		Passenger[] passengers1 = { new Passenger("anton", 86),
				new Passenger("vova", 100), new Passenger("ira", 40) };
		Passenger[] passengers2 = { new Passenger("vika", 45),
				new Passenger("igor", 70), new Passenger("roza", 47) };

		PassengerPlane passengerPlane1 = new PassengerPlane(passengers1,
				engine1, "AN - 24");
		PassengerPlane passengerPlane2 = new PassengerPlane(passengers2,
				engine2, "airobus 360");
	
		MaxWeightOfPassengers MaxWeightOfPassengers = new MaxWeightOfPassengers();
		MaxWeightOfPassengers.maxWeight( passengerPlane1, passengerPlane2);
	
	    MaxValueOfModel maxValueOfModel = new MaxValueOfModel();
	    maxValueOfModel.checkIntegerValue(passengerPlane1 , passengerPlane2);
	    
	    MaxPowerOfEngine maxPowerOfEngine = new MaxPowerOfEngine();
	    maxPowerOfEngine.checkPowerOfEngine(passengerPlane1, passengerPlane2);
	    
	    MaxMiddleWeightPassengersOfPlanes middleWeightPassengersOfPlanes=
	    new MaxMiddleWeightPassengersOfPlanes();
	    middleWeightPassengersOfPlanes.checkMaxWeight(passengerPlane1, passengerPlane2);
	}
}
