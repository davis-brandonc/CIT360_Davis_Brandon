public class UpdThread extends Thread {
    private AtomicTestCounter counter;
 
    public UpdThread(AtomicTestCounter counter) {
        this.counter = counter;
    }
 
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) { ex.printStackTrace(); }
 
        counter.increment();
    }
}