package passengers;

public class MaxValueOfModel {

	public void checkIntegerValue(PassengerPlane passengerPlane1,
			PassengerPlane passengerPlane2) {
		if (Integer.parseInt(passengerPlane1.getModel()
				.replaceAll("[^0-9]", "")) > Integer.parseInt(passengerPlane2
				.getModel().replaceAll("[^0-9]", ""))) {
			System.out.println(passengerPlane1.getModel());
		} else {
			System.out.println(passengerPlane2.getModel());
		}
	}
}
