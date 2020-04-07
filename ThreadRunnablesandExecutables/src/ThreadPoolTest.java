import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    
	public static void main(String[] args) {
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int numberCnt = 0; numberCnt < 3; numberCnt++){
			RunnableTest RunnableTest = 
            new RunnableTest();
			anExecutor.execute(RunnableTest);
		}
		try {
			Thread.sleep(5000);
			System.out.println("Program Awake");
			for(int numberCnt = 0; numberCnt < 2; numberCnt++){
				RunnableTest aRunnableTest = 
                new RunnableTest();
				anExecutor.execute(aRunnableTest);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
