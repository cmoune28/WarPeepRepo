package warpeep.training.week6.Week6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
   
    @Test
    public void shouldAnswerWithTrue()
    {
    	ProductItem testTotalPrice = new ProductItem("test", 10, 2);
    	double output = testTotalPrice.totalPrice();
    	assertTrue( 20 == output);
    }

}
