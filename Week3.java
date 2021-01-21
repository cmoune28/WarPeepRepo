import java.util.Random;

public class Week3 {

	public static void main(String[] args) {
		
		Random num = new Random();	// Use to generate random numbers
		
		int x, y, z;  
		x = num.nextInt(100000);
		y = num.nextInt(100000);
		z = num.nextInt(100000);
		
		
		String msg = " Is the greatest number out of ";
		
		// Logical and comparison operators below
		
		if ( x >= y && x >= z )            
		System.out.println(x + msg );
		
		else if (y >= x && y >= z)
		System.out.println(y + msg);
		
		else 
			System.out.println(z + msg);
		
		System.out.print(x + ", " + y + ",and " + z);
		
		
 
		
	}

}
