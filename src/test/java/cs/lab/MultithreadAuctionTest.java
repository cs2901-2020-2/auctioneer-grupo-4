package cs.lab;

import org.testng.annotations.Test;
public class MultithreadAuctionTest {

    @Test(invocationCount = 100, threadPoolSize = 100) // THREADS
    public void testCase0() {
        Subject subject = new Auctioneer();
        Observer observer = new Bidder();
        subject.registerObserver(observer);
        subject.notifyObservers();
    }
}
