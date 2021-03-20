package warpeep.training.week10.Week10;

import java.util.HashMap;
import java.util.Scanner;

public class App 
{
	enum DaysOfWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
    public static void main( String[] args )
    
    {
    	DaysOfWeek d = DaysOfWeek.SUNDAY;
    	//System.out.println(d);
    	
    	switch(d) {
    	case MONDAY:
    		System.out.println("Monday");
    		break;
    	case TUESDAY:
    		System.out.println("Tuesday");
    		break;
    	case WEDNESDAY:
    		System.out.println("Wednesday");
    		break;
    	case THURSDAY:
    		System.out.println("Thursday");
    		break;
    	case FRIDAY:
    		System.out.println("Friday");
    		break;
    	case SATURDAY:
    		System.out.println("Saturday");
    		break;
    	case SUNDAY:
    		System.out.println("Sunday");
    		break;
    	
    	}
    	
// #2 HASHMAP 
    	
    	HashMap<Integer, String> program = new HashMap<Integer, String>();
    	program.put(0, "Zero");
    	program.put(1, "One");
    	program.put(2, "Two");
    	program.put(3, "Three");
    	program.put(4, "Four");
    	program.put(5, "Five");
    	program.put(6, "Six");
    	program.put(7, "Seven");
    	program.put(8, "Eight");
    	program.put(9, "Nine");
    	
    	System.out.println(program.get(4));
    	
    	

// #4 USING THREAD TO SPEED UP 

    	
    	int[] myArray = getArray();
    	printArrayList(myArray);    	


    }

    public static int[] getArray() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your list of numbers below: ");
		String input = n.nextLine();
		String[] stringArray = input.split(" ");
		int SIZE = stringArray.length;
		int[] intArray = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
	
    public static void printArrayList(int[] array) {
    	for (int i = 0; i < array.length; i++) {
    		System.out.println(array[i]);
    	}
    	
    	

    }
    
    
}
    
    
    

