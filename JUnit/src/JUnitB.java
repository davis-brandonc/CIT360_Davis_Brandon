import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;		

public class JUnitB {				
			public static void main(String[] args) {									
      Result cardtest = JUnitCore.runClasses(JUnitA.class);					
			for (Failure failure : cardtest.getFailures()) {							
         System.out.println(failure.toString());					
      }		
			if (cardtest.wasSuccessful()) {
		        System.out.println("All test were successful! Well Played!");
   }		
  }
}