package warpeep.training.week7.Week7;


public class MotorCycle 
{
//creating instance variables for MotoCycles
	public int color;
	public int gear;
	public int speed;
	Pilot pilot;
	
//Initializing the variable color and speed
	
	public MotorCycle (int color, int gear, int speed, Pilot pilot) {
		this.color = color;
		//this.gear = gear;
		this.speed = speed;
		
// Creating the HAS-An owner relationship
		this.pilot = pilot;
		
	}
	
// method meant to decrease speed
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
// method meant to increase speed
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	/*
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    */
}
