package Log4jTutorial.Alfa;

import org.apache.logging.log4j.*;

public class Demo1 {
    private static Logger log = LogManager.getLogger(Demo1.class.getName());
    public static void main(String[] args)
    {
    log.debug("This is debugging message");
    log.info("This is info message");
    log.error("This is error message");
    }
}
