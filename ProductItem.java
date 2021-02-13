package warpeep.training.week6.Week6;

public class ProductItem {
	
	public static void main(String arrg[]) {
	}
	//variables
	public String name;
	public double price;
	public int quantity;
	public double total;
	
	public ProductItem(String name1, double price1, int quantity1){
		
		name = name1; 
		price = price1;
		quantity = quantity1;
		total = price1 * quantity1;
		
	}

	public double totalPrice () {
		return total;
	}
	
	public void getPrice() {
		 ProductItem getProduct = new ProductItem("Pants", 1254, 425);
	     System.out.println(getProduct.totalPrice());
	}
	
}
