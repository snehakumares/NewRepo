package mylearningphase1.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggingClass {
    private final Logger log = LoggerFactory.getLogger(LoggingClass.class);
    public void check(String input){
        log.info("Processing : "+input);
    }
}
