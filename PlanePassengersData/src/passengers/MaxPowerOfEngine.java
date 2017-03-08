package passengers;
public class MaxPowerOfEngine {
      public void checkPowerOfEngine(PassengerPlane passengerPlane1,
  			PassengerPlane passengerPlane2){
    	if(passengerPlane1.getEngine().getPower()>passengerPlane2.getEngine().getPower()){
    		System.out.println(passengerPlane1.getModel()+" "+passengerPlane1.getEngine().getPower());
    	}  
    	else{
    		System.out.println(passengerPlane2.getModel()+" "+passengerPlane2.getEngine().getPower());
    	}
      }
}
