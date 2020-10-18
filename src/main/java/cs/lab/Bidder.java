package cs.lab;

import java.util.logging.Logger;

public class Bidder implements Observer {

    private static Logger logger = Logger.getLogger(Bidder.class.getName());

    @Override
    public void update() {
        logger.info("Bidder has been updated");
    }

}
