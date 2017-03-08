package passengers;

public class MaxMiddleWeightPassengersOfPlanes {
	public void checkMaxWeight(PassengerPlane passengerPlane1,
			PassengerPlane passengerPlane2) {
		int maxWeight1 = 0;
		int maxWeight2 = 0;
		for (int i = 0; i < passengerPlane1.getPassengers().length; i++) {
			maxWeight1 += passengerPlane1.getPassengers()[i].getWeight();
		}
		for (int i = 0; i < passengerPlane2.getPassengers().length; i++) {
			maxWeight2 += passengerPlane2.getPassengers()[i].getWeight();
		}
		if (maxWeight1 / passengerPlane1.getPassengers().length > maxWeight2
				/ passengerPlane2.getPassengers().length) {
			System.out.println(passengerPlane1.getModel() + " " + maxWeight1
					/ passengerPlane1.getPassengers().length);
		}
		else{
			System.out.println(passengerPlane2.getModel()+" "+maxWeight2
				    / passengerPlane2.getPassengers().length);
		}
	}
}
