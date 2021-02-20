package warpeep.training.week7.Week7;

public class MountainMotorcycle extends MotorCycle {
	
	int seatHeight;
	
	public MountainMotorcycle(int gear, int speed, int startHeight, Pilot pilot){
		super(gear, speed, startHeight, pilot);
		seatHeight = startHeight;
		
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

}
