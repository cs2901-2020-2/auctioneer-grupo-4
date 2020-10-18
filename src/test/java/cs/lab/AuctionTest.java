package cs.lab;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuctionTest {
    static final Logger logger = Logger.getLogger(AuctionTest.class.getName());

    private AuctionTest() {
    }

    @Test //REGISTER
    public void testCase0() {
        Subject subject = new Auctioneer();
        Observer observer = new Bidder();
        subject.registerObserver(observer);
        List<Observer> response = subject.getObservers();
        Assert.assertEquals(observer, response.get(response.size() - 1));
    }

    @Test //REMOVE
    public void testCase1() {
        Subject subject = new Auctioneer();
        Observer observer = new Bidder();
        subject.registerObserver(observer);
        subject.removeObserver(observer);
        List<Observer> response = subject.getObservers();
        Assert.assertEquals(0, response.size());
    }
    //mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
}