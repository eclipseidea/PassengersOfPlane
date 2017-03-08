package passengers;

public class MaxWeightOfPassengers {

	public void maxWeight(PassengerPlane passengerPlane1,PassengerPlane passengerPlane2) {
		String model = "";
		int weight = 0;
		for (int i = 0; i < passengerPlane1.getPassengers().length; i++) {
			if (passengerPlane1.getPassengers()[i].getWeight() > weight) {
				weight = passengerPlane1.getPassengers()[i].getWeight();
				model = passengerPlane1.getModel();
			}
		}
		for (int j = 0; j < passengerPlane2.getPassengers().length; j++) {
			if (passengerPlane2.getPassengers()[j].getWeight() > weight) {
				weight = passengerPlane2.getPassengers()[j].getWeight();
				model = passengerPlane2.getModel();
			}
		}
		System.out.println(weight + "   " + model);
	}
}
