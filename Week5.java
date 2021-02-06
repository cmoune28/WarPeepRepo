package warpeep.training.week5.Week5;

public class Week5 {

	public static void main(String[] args) {

		int [] array = {10, 40, 20, 20};
		
		System.out.println("The total is "+ average(array));
	}
	
	public static double average(int [] x) {
		double total = 0 ;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		return total / x.length;
	}

}
