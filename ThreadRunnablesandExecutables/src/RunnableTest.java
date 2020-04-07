public class RunnableTest implements Runnable{
	
	public void run(){
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread Number: "
                +Thread.currentThread().getName());
			try {
				Thread.currentThread();
				Thread.sleep(100);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}