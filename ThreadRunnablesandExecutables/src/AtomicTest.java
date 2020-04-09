public class AtomicTest {
    static final int NUMBER_THREADS = 100;
 
    public static void main(String[] args) throws InterruptedException {
        AtomicTestCounter counter = new AtomicTestCounter();
        System.out.println("Initial Counter = " + counter.get());
 
        UpdThread[] threads = new UpdThread[NUMBER_THREADS];
 
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new UpdThread(counter);
            threads[i].start();
        }
 
        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i].join();
        }
 
        System.out.println("Final Counter = " + counter.get());
    }
}