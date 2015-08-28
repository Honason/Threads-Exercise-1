import java.util.concurrent.atomic.AtomicInteger;

public class TurnstileCounter {

    static final long DELAY_VAL = 10000;
    // First solution
    // long count = 0;

    // Second solution
    AtomicInteger count = new AtomicInteger(0);


    public AtomicInteger getValue() {
        return count;
    }

    // First solution
    /*public synchronized void incr() {
        count++;
    }*/

    // Second solution
    public void incr() {
        count.incrementAndGet();
    }
}
