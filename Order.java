package warpeep.training.week6.Week6;

import java.util.ArrayList;


public class Order {
	
	public static void main(String arrg[]) {
		
// List of products 
		ProductItem object1 = new ProductItem("Puma", 24, 12);

		ProductItem object2 = new ProductItem("Nike", 120, 10);

		ProductItem object3 = new ProductItem("Gucci", 2251, 231);
		
		
// Creating list from products 
		ArrayList<Double> newList = new ArrayList<Double>();
		
		newList.add(object1.totalPrice());
		newList.add(object2.totalPrice());
		newList.add(object3.totalPrice());
		
		for( double i=0; i<newList.size(); i++) {
			System.out.println(newList.get((int) i));
		}
		
		
		//System.out.println(newList);
		//System.out.println(newList.get(1));                //Printing ArrayList at index 1
		
		
}
}

