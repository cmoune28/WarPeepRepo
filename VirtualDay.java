package warpeep.training.week8.Week8;

//Virtual day / All classes display

public class VirtualDay 
{
    public static void main( String[] args ) throws InterruptedException		//Adding delay between classes execution
    {
    	
    				Thread.sleep(1000);		//This will add various delay between execution. 
    										//First class, Math
    	MathProf.teach();
    				Thread.sleep(1000);     // 1 second
    				
    	MathsChap1.mathLesson();
    				Thread.sleep(1000);
    				
    	MathsChap2.mathLesson();
				Thread.sleep(3000);			// 3 seconds
    
											//Second class, English
    	EnglishProf.teach();
    				Thread.sleep(1000);
    				
    	EngChap1.engLesson();
    				Thread.sleep(1000);	
    				
    	EngChap2.engLesson();
    				Thread.sleep(3000);
    				
    										//Third class, Philosophy
    	PhiloProf.teach();
    				Thread.sleep(1000);
    				
    	PhiloChap1.philoLesson();
    				Thread.sleep(1000);
    				
    	PhiloChap2.philoLesson();
    				Thread.sleep(3000);
    	
   			
    	
    }
    
  
}
