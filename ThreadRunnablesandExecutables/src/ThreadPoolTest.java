import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    
	public static void main(String[] args) {
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int AtomicIntger = 0; AtomicIntger < 3; AtomicIntger++){
			RunnableTest RunnableTest = 
            new RunnableTest();
			anExecutor.execute(RunnableTest);
		}
		try {
			Thread.sleep(5000);
			System.out.println("Program Awake");
			for(int AtomicIntger = 0; AtomicIntger < 2; AtomicIntger++){
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
